/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;
import java.util.*;

public class DepthFirstVoidVisitor implements IVoidVisitor {


  public void visit(final NodeChoice n) {
    n.choice.accept(this);
    return;
  }

  public void visit(final NodeList n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  public void visit(final NodeListOptional n) {
    if (n.present()) {
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        e.next().accept(this);
        }
      return;
    } else
      return;
  }

  public void visit(final NodeOptional n) {
    if (n.present()) {
      n.node.accept(this);
      return;
    } else
    return;
  }

  public void visit(final NodeSequence n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  public void visit(final NodeToken n) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  public void visit(final Program n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final MainClass n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
    n.f8.accept(this);
    n.f9.accept(this);
    n.f10.accept(this);
    n.f11.accept(this);
    n.f12.accept(this);
    n.f13.accept(this);
    n.f14.accept(this);
    n.f15.accept(this);
    n.f16.accept(this);
    n.f17.accept(this);
  }

  public void visit(final TypeDeclaration n) {
    n.f0.accept(this);
  }

  public void visit(final ClassDecl n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final ClassExtendsDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
  }

  public void visit(final VarDecl n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final MethodDecl n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
    n.f8.accept(this);
    n.f9.accept(this);
    n.f10.accept(this);
    n.f11.accept(this);
    n.f12.accept(this);
  }

  public void visit(final FormalList n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final FormalParameter n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final FormalRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final Type n) {
    n.f0.accept(this);
  }

  public void visit(final ArrayType n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final BooleanType n) {
    n.f0.accept(this);
  }

  public void visit(final IntegerType n) {
    n.f0.accept(this);
  }

  public void visit(final Statement n) {
    n.f0.accept(this);
  }

  public void visit(final Block n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final AssignmentStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final ArrayAssignmentStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
  }

  public void visit(final IfStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
  }

  public void visit(final WhileStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final PrintStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final Exp n) {
    n.f0.accept(this);
  }

  public void visit(final AndExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final CompareExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final PlusExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final MinusExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final TimesExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final ArrayLookup n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final ArrayLength n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final MessageSend n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final ExpList n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final ExpRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final PrimaryExpression n) {
    n.f0.accept(this);
  }

  public void visit(final IntegerLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final TrueLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final FalseLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final Identifier n) {
    n.f0.accept(this);
  }

  public void visit(final ThisExpression n) {
    n.f0.accept(this);
  }

  public void visit(final ArrayAllocationExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final AllocationExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final NotExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final BracketExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

}
