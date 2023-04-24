-- Exercise 2.2
--
-- Write a given Java program in the abstract syntax of the language.

newtype Type = Type String

newtype Class = Class (Type, [FieldDecl], [MethodDecl])

newtype FieldDecl = Field (Type, String)

newtype MethodDecl = Method (Type, String, [(Type, String)], Stmt)

data Stmt
  = Block [Stmt]
  | Return Expr
  | While (Expr, Stmt)
  | LocalVarDecl (Type, String)
  | If (Expr, Stmt, Maybe Stmt)
  | StmtExprStmt StmtExpr

data StmtExpr
  = Assign (String, Expr)
  | New (Type, [Expr])
  | MethodCall (Expr, String, [Expr])

data Expr
  = This
  | Super
  | LocalOrFieldVar String
  | InstVar (Expr, String)
  | Unary (String, Expr)
  | Binary (String, Expr, Expr)
  | Integer Integer
  | Bool Bool
  | Char Char
  | String String
  | JNull
  | StmtExprExpr StmtExpr

type Prg = [Class]

c :: Class
c =
  Class
    ( Type "AbsSyn",
      [Field (Type "int", "i"), Field (Type "int", "j")],
      [ Method
          ( Type "void",
            "m",
            [(Type "int", "a"), (Type "int", "b")],
            Block
              [ Block
                  [ While
                      ( Binary ("<", LocalOrFieldVar "b", Integer 15),
                        Block
                          [ Block [StmtExprStmt (Assign ("i", Binary ("+", LocalOrFieldVar "i", LocalOrFieldVar "i")))],
                            Block [StmtExprStmt (MethodCall (LocalOrFieldVar "this", "m", [LocalOrFieldVar "a", LocalOrFieldVar "i"]))]
                          ]
                      )
                  ],
                Block [Return (LocalOrFieldVar "a")]
              ]
          )
      ]
    )

cs :: Class
cs = Class (Type "AbsSyn", [Field (Type "int", "x")], [])

-- Those implementations are not finished yet!
instance Show Type where
  show (Type s) = s

instance Show Class where
  show (Class (t, [], [])) = "class " ++ show t ++ " {}"
  show (Class (t, [fd], [])) = "class " ++ show t ++ " {\n" ++ "    " ++ show fd ++ "\n}"
  show (Class (t, fds, mds)) = "class " ++ show t ++ " {\n" ++ show fds ++ show mds ++ "\n}"

instance Show FieldDecl where
  show (Field (t, s)) = show t ++ " " ++ show s ++ ";"

instance Show MethodDecl where
  show (Method (t, s, ps, b)) = show t ++ " " ++ show s ++ "(" ++ show ps ++ ") " ++ show b

instance Show Stmt where
  show (Block ss) = "{" ++ show ss ++ "}"
  show (Return e) = "return " ++ show e ++ ";"
  show (While (e, s)) = "while (" ++ show e ++ ") " ++ show s
  show (LocalVarDecl (t, s)) = show t ++ " " ++ show s ++ ";"
  show (If (e, s1, Just s2)) = "if (" ++ show e ++ ") " ++ show s1 ++ " else " ++ show s2
  show (If (e, s1, Nothing)) = "if (" ++ show e ++ ") " ++ show s1
  show (StmtExprStmt se) = show se ++ ";"

instance Show StmtExpr where
  show (Assign (s, e)) = show s ++ " = " ++ show e
  show (New (s, es)) = "new " ++ show s ++ "(" ++ show es ++ ")"
  show (MethodCall (e, s, es)) = show e ++ "." ++ show s ++ "(" ++ show es ++ ")"

instance Show Expr where
  show This = "this."
  show Super = "super."
  show (LocalOrFieldVar s) = show s
  show (InstVar (e, s)) = show e ++ "." ++ show s
  show (Unary (s, e)) = show s ++ show e
  show (Binary (s, e1, e2)) = show e1 ++ show s ++ show e2
  show (Integer i) = show i
  show (Bool b) = show b
  show (Char c) = show c
  show (String s) = show s
  show JNull = "null"
  show (StmtExprExpr se) = show se
