package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.Type;

/* loaded from: salesmax.apk:org/objectweb/asm/tree/analysis/BasicValue.SCL.lombok */
public class BasicValue implements Value {
    public static final BasicValue UNINITIALIZED_VALUE = new BasicValue(null);
    public static final BasicValue INT_VALUE = new BasicValue(Type.INT_TYPE);
    public static final BasicValue FLOAT_VALUE = new BasicValue(Type.FLOAT_TYPE);
    public static final BasicValue LONG_VALUE = new BasicValue(Type.LONG_TYPE);
    public static final BasicValue DOUBLE_VALUE = new BasicValue(Type.DOUBLE_TYPE);
    public static final BasicValue REFERENCE_VALUE = new BasicValue(Type.getObjectType("java/lang/Object"));
    public static final BasicValue RETURNADDRESS_VALUE = new BasicValue(Type.VOID_TYPE);

    /* renamed from: type, reason: collision with root package name */
    private final Type f58186type;

    public BasicValue(Type type2) {
        this.f58186type = type2;
    }

    public Type getType() {
        return this.f58186type;
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return (this.f58186type == Type.LONG_TYPE || this.f58186type == Type.DOUBLE_TYPE) ? 2 : 1;
    }

    public boolean isReference() {
        return this.f58186type != null && (this.f58186type.getSort() == 10 || this.f58186type.getSort() == 9);
    }

    public boolean equals(Object value) {
        if (value == this) {
            return true;
        }
        if (value instanceof BasicValue) {
            if (this.f58186type == null) {
                return ((BasicValue) value).f58186type == null;
            }
            return this.f58186type.equals(((BasicValue) value).f58186type);
        }
        return false;
    }

    public int hashCode() {
        if (this.f58186type == null) {
            return 0;
        }
        return this.f58186type.hashCode();
    }

    public String toString() {
        if (this == UNINITIALIZED_VALUE) {
            return ".";
        }
        if (this == RETURNADDRESS_VALUE) {
            return "A";
        }
        if (this == REFERENCE_VALUE) {
            return "R";
        }
        return this.f58186type.getDescriptor();
    }
}
