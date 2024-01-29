import Syntax

typeCheckStatement :: Statement -> [(String, Text)] -> [Class] -> Statement
typeCheckStatement (If (expression, statement, Nothing)) symbolTable cls =
  let bexp = typeCheckStatement expression symbolTable cls
      ifStatement = typeCheckStatement statement symbolTable cls
   in if getTypeFromExpression bexp == Text "boolean"
        then TypedStatement (If (bexp, ifStatement, Nothing), getTypeFromStatement ifStatement)
        else error "boolean expected"

getTypeFromExpression :: Expression -> Text
getTypeFromExpression (TypedExpression (_, typ)) = typ

getTypeFromStatement :: Statement -> Text
getTypeFromStatement (TypedStatement (_, typ)) = typ
