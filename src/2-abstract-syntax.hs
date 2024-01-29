-- Exercise 2.2
--
-- Write a given Java program in the abstract syntax of the language.

import Syntax

c :: Class
c =
  Class
    ( Text "AbsSyn",
      [Field (Text "int", "i"), Field (Text "int", "j")],
      [ Method
          ( Text "void",
            "m",
            [(Text "int", "a"), (Text "int", "b")],
            Block
              [ Block
                  [ While
                      ( Binary ("<", LocalOrFieldVar "b", Integer 15),
                        Block
                          [ Block [StatementExpressionStatement (Assign ("i", Binary ("+", LocalOrFieldVar "i", LocalOrFieldVar "i")))],
                            Block [StatementExpressionStatement (MethodCall (LocalOrFieldVar "this", "m", [LocalOrFieldVar "a", LocalOrFieldVar "i"]))]
                          ]
                      )
                  ],
                Block [Return (LocalOrFieldVar "a")]
              ]
          )
      ]
    )

cs :: Class
cs = Class (Text "AbsSyn", [Field (Text "int", "x")], [])
