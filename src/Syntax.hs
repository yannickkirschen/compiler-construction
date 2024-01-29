-- Exercise 2.2
--
-- Write a given Java program in the abstract syntax of the language.

module Syntax where

newtype Text = Text String

newtype Class = Class (Text, [FieldDeclaration], [MethodDeclaration])

newtype FieldDeclaration = Field (Text, String)

newtype MethodDeclaration = Method (Text, String, [(Text, String)], Statement)

data Statement
  = Block [Statement]
  | Return Expression
  | While (Expression, Statement)
  | LocalVarDeclaration (Text, String)
  | If (Expression, Statement, Maybe Statement)
  | StatementExpressionStatement StatementExpression
  | TypedStatement (Statement, Text)

data StatementExpression
  = Assign (String, Expression)
  | New (Text, [Expression])
  | MethodCall (Expression, String, [Expression])

data Expression
  = This
  | Super
  | LocalOrFieldVar String
  | InstVar (Expression, String)
  | Unary (String, Expression)
  | Binary (String, Expression, Expression)
  | Integer Integer
  | Bool Bool
  | Char Char
  | String String
  | JNull
  | StatementExpressionExpression StatementExpression
  | TypedExpression (Expression, Text)

type Prg = [Class]

-- Those implementations are not finished yet!
instance Show Text where
  show (Text s) = s

instance Show Class where
  show (Class (t, [], [])) = "class " ++ show t ++ " {}"
  show (Class (t, [fd], [])) = "class " ++ show t ++ " {\n" ++ "    " ++ show fd ++ "\n}"
  show (Class (t, fds, mds)) = "class " ++ show t ++ " {\n" ++ show fds ++ show mds ++ "\n}"

instance Show FieldDeclaration where
  show (Field (t, s)) = show t ++ " " ++ show s ++ ";"

instance Show MethodDeclaration where
  show (Method (t, s, ps, b)) = show t ++ " " ++ show s ++ "(" ++ show ps ++ ") " ++ show b

instance Show Statement where
  show (Block ss) = "{" ++ show ss ++ "}"
  show (Return e) = "return " ++ show e ++ ";"
  show (While (e, s)) = "while (" ++ show e ++ ") " ++ show s
  show (LocalVarDeclaration (t, s)) = show t ++ " " ++ show s ++ ";"
  show (If (e, s1, Just s2)) = "if (" ++ show e ++ ") " ++ show s1 ++ " else " ++ show s2
  show (If (e, s1, Nothing)) = "if (" ++ show e ++ ") " ++ show s1
  show (StatementExpressionStatement se) = show se ++ ";"

instance Show StatementExpression where
  show (Assign (s, e)) = show s ++ " = " ++ show e
  show (New (s, es)) = "new " ++ show s ++ "(" ++ show es ++ ")"
  show (MethodCall (e, s, es)) = show e ++ "." ++ show s ++ "(" ++ show es ++ ")"

instance Show Expression where
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
  show (StatementExpressionExpression se) = show se
