package lombok.javac.handlers;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.tree.JCTree;
import lombok.javac.JavacNode;
import lombok.javac.JavacResolution;

/* loaded from: salesmax.apk:lombok/javac/handlers/JavacResolver.SCL.lombok */
public enum JavacResolver {
    CLASS { // from class: lombok.javac.handlers.JavacResolver.1
        @Override // lombok.javac.handlers.JavacResolver
        public Type resolveMember(JavacNode node, JCTree.JCExpression expr) {
            Type type2 = expr.type;
            if (type2 == null) {
                try {
                    new JavacResolution(node.getContext()).resolveClassMember(node);
                    type2 = expr.type;
                } catch (Exception unused) {
                }
            }
            return type2;
        }
    },
    METHOD { // from class: lombok.javac.handlers.JavacResolver.2
        @Override // lombok.javac.handlers.JavacResolver
        public Type resolveMember(JavacNode node, JCTree.JCExpression expr) {
            Type type2 = expr.type;
            if (type2 == null) {
                try {
                    JCTree.JCExpression resolvedExpression = new JavacResolution(node.getContext()).resolveMethodMember(node).get(expr);
                    if (resolvedExpression != null) {
                        type2 = resolvedExpression.type;
                    }
                } catch (Exception unused) {
                }
            }
            return type2;
        }
    },
    CLASS_AND_METHOD { // from class: lombok.javac.handlers.JavacResolver.3
        @Override // lombok.javac.handlers.JavacResolver
        public Type resolveMember(JavacNode node, JCTree.JCExpression expr) {
            JavacNode classNode;
            Type type2 = METHOD.resolveMember(node, expr);
            if (type2 == null) {
                JavacNode javacNodeUp = node;
                while (true) {
                    classNode = javacNodeUp;
                    if (classNode == null || !noneOf(classNode.get(), JCTree.JCBlock.class, JCTree.JCMethodDecl.class, JCTree.JCVariableDecl.class)) {
                        break;
                    }
                    javacNodeUp = classNode.up();
                }
                if (classNode != null) {
                    type2 = CLASS.resolveMember(classNode, expr);
                }
            }
            return type2;
        }

        private boolean noneOf(Object o2, Class<?>... clsArr) {
            for (Class<?> clazz : clsArr) {
                if (clazz.isInstance(o2)) {
                    return false;
                }
            }
            return true;
        }
    };

    public abstract Type resolveMember(JavacNode javacNode, JCTree.JCExpression jCExpression);

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static JavacResolver[] valuesCustom() {
        JavacResolver[] javacResolverArrValuesCustom = values();
        int length = javacResolverArrValuesCustom.length;
        JavacResolver[] javacResolverArr = new JavacResolver[length];
        System.arraycopy(javacResolverArrValuesCustom, 0, javacResolverArr, 0, length);
        return javacResolverArr;
    }

    /* synthetic */ JavacResolver(JavacResolver javacResolver) {
        this();
    }
}
