/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;
import java.util.*;

public class DepthFirstRetArguVisitor<R, A> implements IRetArguVisitor<R, A> {


  public R visit(final NodeChoice n, final A argu) {
    final R nRes = n.choice.accept(this, argu);
    return nRes;
  }

  public R visit(final NodeList n, final A argu) {
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      final R sRes = e.next().accept(this, argu);
    }
    return nRes;
  }

  public R visit(final NodeListOptional n, final A argu) {
    if (n.present()) {
      R nRes = null;
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        @SuppressWarnings("unused")
        R sRes = e.next().accept(this, argu);
        }
      return nRes;
    } else
      return null;
  }

  public R visit(final NodeOptional n, final A argu) {
    if (n.present()) {
      final R nRes = n.node.accept(this, argu);
      return nRes;
    } else
    return null;
  }

  public R visit(final NodeSequence n, final A argu) {
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      R subRet = e.next().accept(this, argu);
    }
    return nRes;
  }

  public R visit(final NodeToken n, @SuppressWarnings("unused") final A argu) {
    R nRes = null;
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return nRes;
  }

  public R visit(final Program n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final MainClass n, final A argu) {
    R nRes = null;
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
    return nRes;
  }

  public R visit(final TypeDeclaration n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final ClassDecl n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    return nRes;
  }

  public R visit(final ClassExtendsDeclaration n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
    return nRes;
  }

  public R visit(final VarDecl n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final MethodDecl n, final A argu) {
    R nRes = null;
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
    return nRes;
  }

  public R visit(final FormalList n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final FormalParameter n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final FormalRest n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final Type n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final ArrayType n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final BooleanType n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final IntegerType n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final Statement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final Block n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final AssignmentStatement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    return nRes;
  }

  public R visit(final ArrayAssignmentStatement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    return nRes;
  }

  public R visit(final IfStatement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    return nRes;
  }

  public R visit(final WhileStatement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    return nRes;
  }

  public R visit(final PrintStatement n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    return nRes;
  }

  public R visit(final Exp n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final AndExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final CompareExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final PlusExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final MinusExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final TimesExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final ArrayLookup n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    return nRes;
  }

  public R visit(final ArrayLength n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

  public R visit(final MessageSend n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    return nRes;
  }

  public R visit(final ExpList n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final ExpRest n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final PrimaryExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final IntegerLiteral n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final TrueLiteral n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final FalseLiteral n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final Identifier n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final ThisExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    return nRes;
  }

  public R visit(final ArrayAllocationExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    return nRes;
  }

  public R visit(final AllocationExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    return nRes;
  }

  public R visit(final NotExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    return nRes;
  }

  public R visit(final BracketExpression n, final A argu) {
    R nRes = null;
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    return nRes;
  }

}
