-- Exercise 1.1
--
-- Provide a Haskell implementation of the logical operations and, or, and xor,
-- and a function neg that negates a Boolean value. Also, implement a half-adder
-- and a full-adder for binary numbers.

and_ :: (Bool, Bool) -> Bool
and_ (a, b)
  | a && b = True
  | otherwise = False

or_ :: (Bool, Bool) -> Bool
or_ (a, b)
  | a || b = True
  | otherwise = False

xor_ :: (Bool, Bool) -> Bool
xor_ (a, b)
  | a && b = True
  | not a && b = True
  | otherwise = False

neg :: Bool -> Bool
neg a
  | a = False
  | otherwise = True

halfAdder :: (Bool, Bool) -> (Bool, Bool)
halfAdder (a, b) = (xor_ (a, b), and_ (a, b))

fullAdder :: (Bool, Bool, Bool) -> (Bool, Bool)
fullAdder (a, b, c) =
  let (e1, c1) = halfAdder (a, b)
      (e2, c2) = halfAdder (c, e1)
   in (e2, or_ (c1, c2))
