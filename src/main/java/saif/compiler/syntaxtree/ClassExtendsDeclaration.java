package saif.compiler.syntaxtree;

public class ClassExtendsDeclaration extends ClassDecl{
	Identifier className;
	Identifier baseClass;
	VarDeclList varDeclList;
	MethodDeclList methodList;
	public ClassExtendsDeclaration(Identifier className, Identifier baseClass, VarDeclList varDeclList, MethodDeclList methodList){
		this.className = className;
		this.baseClass = baseClass;
		this.varDeclList = varDeclList;
		this.methodList = methodList;
	}
}
