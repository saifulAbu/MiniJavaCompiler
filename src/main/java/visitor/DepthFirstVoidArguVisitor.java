/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;
import java.util.*;

public class DepthFirstVoidArguVisitor<A> implements IVoidArguVisitor<A> {


  public void visit(final NodeChoice n, final A argu) {
    n.choice.accept(this, argu);
    return;
  }

  public void visit(final NodeList n, final A argu) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this, argu);
    }
    return;
  }

  public void visit(final NodeListOptional n, final A argu) {
    if (n.present()) {
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        e.next().accept(this, argu);
        }
      return;
    } else
      return;
  }

  public void visit(final NodeOptional n, final A argu) {
    if (n.present()) {
      n.node.accept(this, argu);
      return;
    } else
    return;
  }

  public void visit(final NodeSequence n, final A argu) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this, argu);
    }
    return;
  }

  public void visit(final NodeToken n, @SuppressWarnings("unused") final A argu) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  public void visit(final Program n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final MainClass n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
    n.f8.accept(this, argu);
    n.f9.accept(this, argu);
    n.f10.accept(this, argu);
    n.f11.accept(this, argu);
    n.f12.accept(this, argu);
    n.f13.accept(this, argu);
    n.f14.accept(this, argu);
    n.f15.accept(this, argu);
    n.f16.accept(this, argu);
    n.f17.accept(this, argu);
  }

  public void visit(final TypeDeclaration n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ClassDecl n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final ClassExtendsDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
  }

  public void visit(final VarDecl n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final MethodDecl n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
    n.f8.accept(this, argu);
    n.f9.accept(this, argu);
    n.f10.accept(this, argu);
    n.f11.accept(this, argu);
    n.f12.accept(this, argu);
  }

  public void visit(final FormalList n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final FormalParameter n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final FormalRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final Type n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ArrayType n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final BooleanType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final IntegerType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Statement n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Block n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final AssignmentStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final ArrayAssignmentStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
  }

  public void visit(final IfStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
  }

  public void visit(final WhileStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final PrintStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final Exp n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final AndExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final CompareExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final PlusExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final MinusExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final TimesExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final ArrayLookup n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final ArrayLength n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final MessageSend n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final ExpList n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final ExpRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final PrimaryExpression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final IntegerLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final TrueLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final FalseLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Identifier n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ThisExpression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ArrayAllocationExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final AllocationExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final NotExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final BracketExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

}
