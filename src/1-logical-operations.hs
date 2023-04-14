-- Exercise 1.1
--
-- Provide a Haskell implementation of the logical operations and, or, and xor,
-- and a function neg that negates a Boolean value. Also, implement a half-adder
-- and a full-adder for binary numbers.

and_ :: (Bool, Bool) -> Bool
and_ (a, b) | a == True && b == True = True
            | otherwise = False

or_ :: (Bool, Bool) -> Bool
or_ (a, b) | a == True || b == True = True
           | otherwise = False

xor_ :: (Bool, Bool) -> Bool
xor_ (a, b) | a == True && b == False = True
            | a == False && b == True = True
            | otherwise = False

neg :: Bool -> Bool
neg a | a == True = False
      | otherwise = True

half_adder :: (Bool, Bool) -> (Bool, Bool)
half_adder (a, b) = (xor_(a, b), and_(a, b))

full_adder :: (Bool, Bool, Bool) -> (Bool, Bool)
full_adder (a, b, c) = let
                            (e1, c1) = half_adder(a, b)
                            (e2, c2) = half_adder(c, e1)
                       in (e2, or_(c1, c2))
