/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class ArrayAssignmentStatement implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public Exp f2;

  public NodeToken f3;

  public NodeToken f4;

  public Exp f5;

  public NodeToken f6;

  private static final long serialVersionUID = 144L;

  public ArrayAssignmentStatement(final NodeToken n0, final NodeToken n1, final Exp n2, final NodeToken n3, final NodeToken n4, final Exp n5, final NodeToken n6) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
  }

  public ArrayAssignmentStatement(final NodeToken n0, final Exp n1, final Exp n2) {
    f0 = n0;
    f1 = new NodeToken("[");
    f2 = n1;
    f3 = new NodeToken("]");
    f4 = new NodeToken("=");
    f5 = n2;
    f6 = new NodeToken(";");
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
