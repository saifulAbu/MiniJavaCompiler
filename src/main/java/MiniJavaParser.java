/* Generated By:JavaCC: Do not edit this line. MiniJavaParser.java */
  import saif.compiler.syntaxtree.*;
  public class MiniJavaParser implements MiniJavaParserConstants {

// The following is a simple grammar that will allow you
// to test the generated lexer.
/*
void Goal() :
{}
{
  ( MiniJavaToken() )*
  <EOF>
}

void MiniJavaToken():
{}
{
  "{" | "public" | "static" | "void" |
  "main" | "(" | "String"  | "[" | "]" | ")" | "}" | "extends" | ";"
  | "return" | "," | "int" | "boolean" | "=" | "if" | "else" | "while"
  | "System.out.println" | "&&" | "<" | "+" | "-" | "*" | "." |
  "length" | <INTEGER_LITERAL> | "true" | "false" | "this" | "new" |
  "!"
}
*/
//adding parser
  static final public void Program() throws ParseException {
    MainClass();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      ClassDecl();
    }
    jj_consume_token(0);
  }

//rule for main class
  static final public void MainClass() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LBRACE);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(LPAREN);
    jj_consume_token(STRING);
    jj_consume_token(LBRACKET);
    jj_consume_token(RBRACKET);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_2:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_2;
      }
      VarDecl();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case LBRACE:
      case PRINTLN:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_3;
      }
      Statement();
    }
    jj_consume_token(RBRACE);
    jj_consume_token(RBRACE);
  }

  static final public void ClassDecl() throws ParseException {
    if (jj_2_2(3)) {
      ClassDeclSimple();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ClassExtendsDeclaration();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

//rule for class other than main
  static final public void ClassDeclSimple() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LBRACE);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      VarDecl();
    }
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PUBLIC:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_5;
      }
      MethodDecl();
    }
    jj_consume_token(RBRACE);
  }

  static final public void ClassExtendsDeclaration() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(EXTENDS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LBRACE);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_6;
      }
      VarDecl();
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PUBLIC:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_7;
      }
      MethodDecl();
    }
    jj_consume_token(RBRACE);
  }

  static final public void VarDecl() throws ParseException {
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(SEMICOLON);
  }

  static final public void MethodDecl() throws ParseException {
    jj_consume_token(PUBLIC);
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case BOOLEAN:
    case IDENTIFIER:
      FormalList();
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_8:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_8;
      }
      VarDecl();
    }
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case LBRACE:
      case PRINTLN:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_9;
      }
      Statement();
    }
    jj_consume_token(RETURN);
    Exp();
    jj_consume_token(SEMICOLON);
    jj_consume_token(RBRACE);
  }

  static final public void FormalList() throws ParseException {
    FormalParameter();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_10;
      }
      FormalRest();
    }
  }

  static final public void FormalParameter() throws ParseException {
    Type();
    jj_consume_token(IDENTIFIER);
  }

  static final public void FormalRest() throws ParseException {
    jj_consume_token(COMMA);
    FormalParameter();
  }

  static final public void Type() throws ParseException {
    if (jj_2_4(2)) {
      IntArrayType();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOOLEAN:
        BooleanType();
        break;
      case INT:
        IntegerType();
        break;
      case IDENTIFIER:
        IdentifierType();
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void IdentifierType() throws ParseException {
    jj_consume_token(IDENTIFIER);
  }

  static final public void IntArrayType() throws ParseException {
    jj_consume_token(INT);
    jj_consume_token(LBRACKET);
    jj_consume_token(RBRACKET);
  }

  static final public void BooleanType() throws ParseException {
    jj_consume_token(BOOLEAN);
  }

  static final public void IntegerType() throws ParseException {
    jj_consume_token(INT);
  }

  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACE:
      Block();
      break;
    default:
      jj_la1[11] = jj_gen;
      if (jj_2_5(2)) {
        AssignmentStatement();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ArrayAssignmentStatement();
          break;
        case IF:
          IfStatement();
          break;
        case WHILE:
          WhileStatement();
          break;
        case PRINTLN:
          PrintStatement();
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  static final public void Block() throws ParseException {
    jj_consume_token(LBRACE);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case LBRACE:
      case PRINTLN:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_11;
      }
      Statement();
    }
    jj_consume_token(RBRACE);
  }

  static final public void AssignmentStatement() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(EQUAL);
    Exp();
    jj_consume_token(SEMICOLON);
  }

  static final public void ArrayAssignmentStatement() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LBRACKET);
    Exp();
    jj_consume_token(RBRACKET);
    jj_consume_token(EQUAL);
    Exp();
    jj_consume_token(SEMICOLON);
  }

  static final public void IfStatement() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(LPAREN);
    Exp();
    jj_consume_token(RPAREN);
    Statement();
    jj_consume_token(ELSE);
    Statement();
  }

  static final public void WhileStatement() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(LPAREN);
    Exp();
    jj_consume_token(RPAREN);
    Statement();
  }

  static final public void PrintStatement() throws ParseException {
    jj_consume_token(PRINTLN);
    jj_consume_token(LPAREN);
    Exp();
    jj_consume_token(RPAREN);
    jj_consume_token(SEMICOLON);
  }

//Expression
  static final public Exp Exp() throws ParseException {
 Exp exp;
    if (jj_2_6(3)) {
      exp = AndExpression();
    } else if (jj_2_7(3)) {
      exp = LessThanExpression();
    } else if (jj_2_8(3)) {
      exp = PlusExpression();
    } else if (jj_2_9(3)) {
      exp = MinusExpression();
    } else if (jj_2_10(3)) {
      exp = TimesExpression();
    } else if (jj_2_11(3)) {
      exp = ArrayLookup();
    } else if (jj_2_12(3)) {
      exp = ArrayLength();
    } else if (jj_2_13(3)) {
      exp = Call();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FALSE:
      case TRUE:
      case THIS:
      case NEW:
      case LPAREN:
      case NOT:
      case IDENTIFIER:
      case INTEGER_LITERAL:
        exp = PrimaryExpression();
                {if (true) return exp;}
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public AndExpression AndExpression() throws ParseException {
 Exp exp1, exp2;
    exp1 = PrimaryExpression();
    jj_consume_token(AND);
    exp2 = PrimaryExpression();
                {if (true) return new AndExpression(exp1, exp2);}
    throw new Error("Missing return statement in function");
  }

  static final public LessThanExpression LessThanExpression() throws ParseException {
 Exp exp1, exp2;
    exp1 = PrimaryExpression();
    jj_consume_token(LESS);
    exp2 = PrimaryExpression();
                {if (true) return new LessThanExpression(exp1, exp2);}
    throw new Error("Missing return statement in function");
  }

  static final public PlusExpression PlusExpression() throws ParseException {
 Exp exp1, exp2;
    exp1 = PrimaryExpression();
    jj_consume_token(PLUS);
    exp2 = PrimaryExpression();
                {if (true) return new PlusExpression(exp1, exp2);}
    throw new Error("Missing return statement in function");
  }

  static final public MinusExpression MinusExpression() throws ParseException {
 Exp exp1, exp2;
    exp1 = PrimaryExpression();
    jj_consume_token(MINUS);
    exp2 = PrimaryExpression();
                {if (true) return new MinusExpression(exp1, exp2);}
    throw new Error("Missing return statement in function");
  }

  static final public TimesExpression TimesExpression() throws ParseException {
 Exp exp1, exp2;
    exp1 = PrimaryExpression();
    jj_consume_token(TIMES);
    exp2 = PrimaryExpression();
                {if (true) return new TimesExpression(exp1, exp2);}
    throw new Error("Missing return statement in function");
  }

  static final public ArrayLookup ArrayLookup() throws ParseException {
 Exp idExp, indexExp;
    idExp = PrimaryExpression();
    jj_consume_token(LBRACKET);
    indexExp = Exp();
    jj_consume_token(RBRACKET);
        {if (true) return new ArrayLookup(idExp, indexExp);}
    throw new Error("Missing return statement in function");
  }

  static final public ArrayLength ArrayLength() throws ParseException {
 Exp ex;
    ex = PrimaryExpression();
    jj_consume_token(DOT);
    jj_consume_token(LENGTH);
                {if (true) return new ArrayLength(ex);}
    throw new Error("Missing return statement in function");
  }

  static final public Call Call() throws ParseException {
 Exp ex; Token t; ExpList expList = null;
    ex = PrimaryExpression();
    jj_consume_token(DOT);
    t = jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case FALSE:
    case TRUE:
    case THIS:
    case NEW:
    case LPAREN:
    case NOT:
    case IDENTIFIER:
    case INTEGER_LITERAL:
      expList = ExpList();
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
        Identifier id = new Identifier(t.image);
        {if (true) return new Call(ex, id, expList);}
    throw new Error("Missing return statement in function");
  }

  static final public ExpList ExpList() throws ParseException {
 ExpList expList = new ExpList(); Exp exp;
    exp = Exp();
                expList.addElement(exp);
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_12;
      }
      exp = ExpRest();
                                                            expList.addElement(exp);
    }
    {if (true) return expList;}
    throw new Error("Missing return statement in function");
  }

  static final public Exp ExpRest() throws ParseException {
 Exp ex;
    jj_consume_token(COMMA);
    ex = Exp();
                    {if (true) return ex;}
    throw new Error("Missing return statement in function");
  }

  static final public Exp PrimaryExpression() throws ParseException {
 Exp exp;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
      exp = IntegerLiteral();
      break;
    case TRUE:
      exp = TrueLiteral();
      break;
    case FALSE:
      exp = FalseLiteral();
      break;
    case IDENTIFIER:
      exp = IdentifierExpression();
      break;
    case THIS:
      exp = ThisExpression();
      break;
    default:
      jj_la1[17] = jj_gen;
      if (jj_2_14(2)) {
        exp = NewArray();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NEW:
          exp = NewObject();
          break;
        case NOT:
          exp = NotExpression();
          break;
        case LPAREN:
          exp = BracketExpression();
     {if (true) return exp;}
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public IntegerLiteral IntegerLiteral() throws ParseException {
 Token t;
    t = jj_consume_token(INTEGER_LITERAL);
                {if (true) return new IntegerLiteral(Integer.parseInt(t.image));}
    throw new Error("Missing return statement in function");
  }

  static final public TrueLiteral TrueLiteral() throws ParseException {
    jj_consume_token(TRUE);
                {if (true) return new TrueLiteral();}
    throw new Error("Missing return statement in function");
  }

  static final public FalseLiteral FalseLiteral() throws ParseException {
    jj_consume_token(FALSE);
                {if (true) return new FalseLiteral();}
    throw new Error("Missing return statement in function");
  }

  static final public IdentifierExpression IdentifierExpression() throws ParseException {
 Token t;
    t = jj_consume_token(IDENTIFIER);
                {if (true) return new IdentifierExpression(t.image);}
    throw new Error("Missing return statement in function");
  }

  static final public ThisExpression ThisExpression() throws ParseException {
    jj_consume_token(THIS);
                {if (true) return new ThisExpression();}
    throw new Error("Missing return statement in function");
  }

  static final public NewArray NewArray() throws ParseException {
 Exp exp;
    jj_consume_token(NEW);
    jj_consume_token(INT);
    jj_consume_token(LBRACKET);
    exp = Exp();
    jj_consume_token(RBRACKET);
                {if (true) return new NewArray(exp);}
    throw new Error("Missing return statement in function");
  }

  static final public NewObject NewObject() throws ParseException {
 NewObject obj; Token t; Identifier id;
    jj_consume_token(NEW);
    t = jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    jj_consume_token(RPAREN);
         id = new Identifier(t.image);
         obj = new NewObject(id);
         {if (true) return obj;}
    throw new Error("Missing return statement in function");
  }

  static final public NotExpression NotExpression() throws ParseException {
 Exp exp;
    jj_consume_token(NOT);
    exp = Exp();
         {if (true) return new NotExpression(exp);}
    throw new Error("Missing return statement in function");
  }

  static final public Exp BracketExpression() throws ParseException {
 Exp ex;
    jj_consume_token(LPAREN);
    ex = Exp();
    jj_consume_token(RPAREN);
         {if (true) return ex;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  static private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  static private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  static private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  static private boolean jj_3R_38() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(AND)) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_3R_36() {
    if (jj_3R_45()) return true;
    return false;
  }

  static private boolean jj_3R_35() {
    if (jj_3R_44()) return true;
    return false;
  }

  static private boolean jj_3R_34() {
    if (jj_3R_43()) return true;
    return false;
  }

  static private boolean jj_3R_37() {
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_3_14() {
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3_13() {
    if (jj_3R_24()) return true;
    return false;
  }

  static private boolean jj_3R_33() {
    if (jj_3R_42()) return true;
    return false;
  }

  static private boolean jj_3_12() {
    if (jj_3R_23()) return true;
    return false;
  }

  static private boolean jj_3R_32() {
    if (jj_3R_41()) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_3R_15()) return true;
    return false;
  }

  static private boolean jj_3R_26() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_scan_token(3)) {
    jj_scanpos = xsp;
    if (jj_scan_token(1)) {
    jj_scanpos = xsp;
    if (jj_scan_token(38)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3_11() {
    if (jj_3R_22()) return true;
    return false;
  }

  static private boolean jj_3R_27() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_29()) {
    jj_scanpos = xsp;
    if (jj_3R_30()) {
    jj_scanpos = xsp;
    if (jj_3R_31()) {
    jj_scanpos = xsp;
    if (jj_3R_32()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) {
    jj_scanpos = xsp;
    if (jj_3_14()) {
    jj_scanpos = xsp;
    if (jj_3R_34()) {
    jj_scanpos = xsp;
    if (jj_3R_35()) {
    jj_scanpos = xsp;
    if (jj_3R_36()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_29() {
    if (jj_3R_38()) return true;
    return false;
  }

  static private boolean jj_3R_31() {
    if (jj_3R_40()) return true;
    return false;
  }

  static private boolean jj_3_10() {
    if (jj_3R_21()) return true;
    return false;
  }

  static private boolean jj_3R_30() {
    if (jj_3R_39()) return true;
    return false;
  }

  static private boolean jj_3_9() {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3_8() {
    if (jj_3R_19()) return true;
    return false;
  }

  static private boolean jj_3_7() {
    if (jj_3R_18()) return true;
    return false;
  }

  static private boolean jj_3_6() {
    if (jj_3R_17()) return true;
    return false;
  }

  static private boolean jj_3R_28() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_6()) {
    jj_scanpos = xsp;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) {
    jj_scanpos = xsp;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3_10()) {
    jj_scanpos = xsp;
    if (jj_3_11()) {
    jj_scanpos = xsp;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_3R_37()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_45() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_28()) return true;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  static private boolean jj_3R_44() {
    if (jj_scan_token(NOT)) return true;
    if (jj_3R_28()) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_13()) return true;
    return false;
  }

  static private boolean jj_3R_43() {
    if (jj_scan_token(NEW)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  static private boolean jj_3R_24() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_23() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(DOT)) return true;
    if (jj_scan_token(LENGTH)) return true;
    return false;
  }

  static private boolean jj_3R_25() {
    if (jj_scan_token(NEW)) return true;
    if (jj_scan_token(INT)) return true;
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_3R_26()) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_42() {
    if (jj_scan_token(THIS)) return true;
    return false;
  }

  static private boolean jj_3R_22() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_3R_28()) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(EQUAL)) return true;
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(TIMES)) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_3R_41() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    if (jj_scan_token(CLASS)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(LBRACE)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_13()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_3R_14()) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(MINUS)) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_3R_40() {
    if (jj_scan_token(FALSE)) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(PLUS)) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_3R_39() {
    if (jj_scan_token(TRUE)) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_scan_token(INT)) return true;
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_3R_27()) return true;
    if (jj_scan_token(LESS)) return true;
    if (jj_3R_27()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public MiniJavaParserTokenManager token_source;
  static JavaCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000,0x20201080,0x4000,0xa,0x2000,0xa,0x2000,0xa,0x20201080,0x4000000,0xa,0x200000,0x20001080,0x20201080,0x80c30,0x80c30,0x4000000,0x430,0x80800,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x40,0x0,0x40,0x0,0x40,0x0,0x40,0x40,0x0,0x40,0x0,0x40,0x40,0xc8,0xc8,0x0,0xc0,0x8,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[14];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public MiniJavaParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MiniJavaParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public MiniJavaParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public MiniJavaParser(MiniJavaParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(MiniJavaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        exists = true;
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[45];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 45; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 14; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                               }