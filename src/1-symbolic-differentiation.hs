-- Exercise 1.2
--
-- Provide a Haskell implementation of the function that computes the derivative of
-- a polynomial. The function should take a polynomial as an argument and return
-- the derivative of that polynomial. The polynomial should be represented as a
-- Haskell data type. The derivative of a polynomial is another polynomial.

data Term = Mon (Float, Int)
          | Add (Term, Term)
          | Mul (Term, Term)
          | Div (Term, Term)
            deriving (Show)

diff :: Term -> Term
diff (Mon (a, b)) = Mon (a * fromIntegral (b), b - 1)
diff (Add (a, b)) = Add (diff a, diff b)
diff (Mul (a, b)) = Add (Mul (diff a, b), Mul (a, diff b))
diff (Div (a, b)) = Div (Add (Mul (diff a, b), Mul (Mul (a, Mon (-1, 0)), diff b)), Mul (b, b))
