package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.MethodVisitor;

/* loaded from: salesmax.apk:org/objectweb/asm/tree/TryCatchBlockNode.SCL.lombok */
public class TryCatchBlockNode {
    public LabelNode start;
    public LabelNode end;
    public LabelNode handler;

    /* renamed from: type, reason: collision with root package name */
    public String f58185type;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode start, LabelNode end, LabelNode handler, String type2) {
        this.start = start;
        this.end = end;
        this.handler = handler;
        this.f58185type = type2;
    }

    public void updateIndex(int index) {
        int newTypeRef = 1107296256 | (index << 8);
        if (this.visibleTypeAnnotations != null) {
            int n = this.visibleTypeAnnotations.size();
            for (int i = 0; i < n; i++) {
                this.visibleTypeAnnotations.get(i).typeRef = newTypeRef;
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            int n2 = this.invisibleTypeAnnotations.size();
            for (int i2 = 0; i2 < n2; i2++) {
                this.invisibleTypeAnnotations.get(i2).typeRef = newTypeRef;
            }
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTryCatchBlock(this.start.getLabel(), this.end.getLabel(), this.handler == null ? null : this.handler.getLabel(), this.f58185type);
        if (this.visibleTypeAnnotations != null) {
            int n = this.visibleTypeAnnotations.size();
            for (int i = 0; i < n; i++) {
                TypeAnnotationNode typeAnnotation = this.visibleTypeAnnotations.get(i);
                typeAnnotation.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            int n2 = this.invisibleTypeAnnotations.size();
            for (int i2 = 0; i2 < n2; i2++) {
                TypeAnnotationNode typeAnnotation2 = this.invisibleTypeAnnotations.get(i2);
                typeAnnotation2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotation2.typeRef, typeAnnotation2.typePath, typeAnnotation2.desc, false));
            }
        }
    }
}
