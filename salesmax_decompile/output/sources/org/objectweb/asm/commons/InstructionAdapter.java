package org.objectweb.asm.commons;

import com.google.api.Service;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.um5;
import p001o.wm5;

/* loaded from: salesmax.apk:org/objectweb/asm/commons/InstructionAdapter.SCL.lombok */
public class InstructionAdapter extends MethodVisitor {
    public static final Type OBJECT_TYPE = Type.getType("Ljava/lang/Object;");

    public InstructionAdapter(MethodVisitor methodVisitor) {
        this(Opcodes.ASM9, methodVisitor);
        if (getClass() != InstructionAdapter.class) {
            throw new IllegalStateException();
        }
    }

    protected InstructionAdapter(int api, MethodVisitor methodVisitor) {
        super(api, methodVisitor);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int opcode) {
        switch (opcode) {
            case 0:
                nop();
                return;
            case 1:
                aconst(null);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                iconst(opcode - 3);
                return;
            case 9:
            case 10:
                lconst(opcode - 9);
                return;
            case 11:
            case 12:
            case 13:
                fconst(opcode - 11);
                return;
            case 14:
            case 15:
                dconst(opcode - 14);
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 35:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 37:
            case 38:
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case SignatureVisitor.EXTENDS /* 43 */:
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 45:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case Opcodes.V15 /* 59 */:
            case Opcodes.V16 /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
            case TypeReference.INSTANCEOF /* 67 */:
            case TypeReference.NEW /* 68 */:
            case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
            case TypeReference.METHOD_REFERENCE /* 70 */:
            case TypeReference.CAST /* 71 */:
            case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
            case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
            case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
            case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
            case 76:
            case 77:
            case 78:
            case Opcodes.IINC /* 132 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.GOTO /* 167 */:
            case Opcodes.JSR /* 168 */:
            case Opcodes.RET /* 169 */:
            case Opcodes.TABLESWITCH /* 170 */:
            case Opcodes.LOOKUPSWITCH /* 171 */:
            case Opcodes.GETSTATIC /* 178 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.GETFIELD /* 180 */:
            case Opcodes.PUTFIELD /* 181 */:
            case Opcodes.INVOKEVIRTUAL /* 182 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.INVOKESTATIC /* 184 */:
            case Opcodes.INVOKEINTERFACE /* 185 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case Opcodes.NEW /* 187 */:
            case Opcodes.NEWARRAY /* 188 */:
            case Opcodes.ANEWARRAY /* 189 */:
            case Opcodes.CHECKCAST /* 192 */:
            case Opcodes.INSTANCEOF /* 193 */:
            default:
                throw new IllegalArgumentException();
            case 46:
                aload(Type.INT_TYPE);
                return;
            case 47:
                aload(Type.LONG_TYPE);
                return;
            case 48:
                aload(Type.FLOAT_TYPE);
                return;
            case 49:
                aload(Type.DOUBLE_TYPE);
                return;
            case 50:
                aload(OBJECT_TYPE);
                return;
            case 51:
                aload(Type.BYTE_TYPE);
                return;
            case 52:
                aload(Type.CHAR_TYPE);
                return;
            case 53:
                aload(Type.SHORT_TYPE);
                return;
            case Opcodes.IASTORE /* 79 */:
                astore(Type.INT_TYPE);
                return;
            case 80:
                astore(Type.LONG_TYPE);
                return;
            case Opcodes.FASTORE /* 81 */:
                astore(Type.FLOAT_TYPE);
                return;
            case Opcodes.DASTORE /* 82 */:
                astore(Type.DOUBLE_TYPE);
                return;
            case Opcodes.AASTORE /* 83 */:
                astore(OBJECT_TYPE);
                return;
            case Opcodes.BASTORE /* 84 */:
                astore(Type.BYTE_TYPE);
                return;
            case Opcodes.CASTORE /* 85 */:
                astore(Type.CHAR_TYPE);
                return;
            case 86:
                astore(Type.SHORT_TYPE);
                return;
            case Opcodes.POP /* 87 */:
                pop();
                return;
            case Opcodes.POP2 /* 88 */:
                pop2();
                return;
            case Opcodes.DUP /* 89 */:
                dup();
                return;
            case Opcodes.DUP_X1 /* 90 */:
                dupX1();
                return;
            case Opcodes.DUP_X2 /* 91 */:
                dupX2();
                return;
            case Opcodes.DUP2 /* 92 */:
                dup2();
                return;
            case Opcodes.DUP2_X1 /* 93 */:
                dup2X1();
                return;
            case Opcodes.DUP2_X2 /* 94 */:
                dup2X2();
                return;
            case Opcodes.SWAP /* 95 */:
                swap();
                return;
            case 96:
                add(Type.INT_TYPE);
                return;
            case Opcodes.LADD /* 97 */:
                add(Type.LONG_TYPE);
                return;
            case Opcodes.FADD /* 98 */:
                add(Type.FLOAT_TYPE);
                return;
            case Opcodes.DADD /* 99 */:
                add(Type.DOUBLE_TYPE);
                return;
            case 100:
                sub(Type.INT_TYPE);
                return;
            case 101:
                sub(Type.LONG_TYPE);
                return;
            case 102:
                sub(Type.FLOAT_TYPE);
                return;
            case 103:
                sub(Type.DOUBLE_TYPE);
                return;
            case 104:
                mul(Type.INT_TYPE);
                return;
            case 105:
                mul(Type.LONG_TYPE);
                return;
            case Opcodes.FMUL /* 106 */:
                mul(Type.FLOAT_TYPE);
                return;
            case Opcodes.DMUL /* 107 */:
                mul(Type.DOUBLE_TYPE);
                return;
            case 108:
                div(Type.INT_TYPE);
                return;
            case Opcodes.LDIV /* 109 */:
                div(Type.LONG_TYPE);
                return;
            case 110:
                div(Type.FLOAT_TYPE);
                return;
            case Opcodes.DDIV /* 111 */:
                div(Type.DOUBLE_TYPE);
                return;
            case 112:
                rem(Type.INT_TYPE);
                return;
            case Opcodes.LREM /* 113 */:
                rem(Type.LONG_TYPE);
                return;
            case Opcodes.FREM /* 114 */:
                rem(Type.FLOAT_TYPE);
                return;
            case Opcodes.DREM /* 115 */:
                rem(Type.DOUBLE_TYPE);
                return;
            case 116:
                neg(Type.INT_TYPE);
                return;
            case Opcodes.LNEG /* 117 */:
                neg(Type.LONG_TYPE);
                return;
            case Opcodes.FNEG /* 118 */:
                neg(Type.FLOAT_TYPE);
                return;
            case Opcodes.DNEG /* 119 */:
                neg(Type.DOUBLE_TYPE);
                return;
            case 120:
                shl(Type.INT_TYPE);
                return;
            case Opcodes.LSHL /* 121 */:
                shl(Type.LONG_TYPE);
                return;
            case 122:
                shr(Type.INT_TYPE);
                return;
            case Opcodes.LSHR /* 123 */:
                shr(Type.LONG_TYPE);
                return;
            case 124:
                ushr(Type.INT_TYPE);
                return;
            case Opcodes.LUSHR /* 125 */:
                ushr(Type.LONG_TYPE);
                return;
            case 126:
                and(Type.INT_TYPE);
                return;
            case Opcodes.LAND /* 127 */:
                and(Type.LONG_TYPE);
                return;
            case 128:
                or(Type.INT_TYPE);
                return;
            case Opcodes.LOR /* 129 */:
                or(Type.LONG_TYPE);
                return;
            case 130:
                xor(Type.INT_TYPE);
                return;
            case Opcodes.LXOR /* 131 */:
                xor(Type.LONG_TYPE);
                return;
            case Opcodes.I2L /* 133 */:
                cast(Type.INT_TYPE, Type.LONG_TYPE);
                return;
            case Opcodes.I2F /* 134 */:
                cast(Type.INT_TYPE, Type.FLOAT_TYPE);
                return;
            case Opcodes.I2D /* 135 */:
                cast(Type.INT_TYPE, Type.DOUBLE_TYPE);
                return;
            case Opcodes.L2I /* 136 */:
                cast(Type.LONG_TYPE, Type.INT_TYPE);
                return;
            case Opcodes.L2F /* 137 */:
                cast(Type.LONG_TYPE, Type.FLOAT_TYPE);
                return;
            case Opcodes.L2D /* 138 */:
                cast(Type.LONG_TYPE, Type.DOUBLE_TYPE);
                return;
            case Opcodes.F2I /* 139 */:
                cast(Type.FLOAT_TYPE, Type.INT_TYPE);
                return;
            case Opcodes.F2L /* 140 */:
                cast(Type.FLOAT_TYPE, Type.LONG_TYPE);
                return;
            case Opcodes.F2D /* 141 */:
                cast(Type.FLOAT_TYPE, Type.DOUBLE_TYPE);
                return;
            case Opcodes.D2I /* 142 */:
                cast(Type.DOUBLE_TYPE, Type.INT_TYPE);
                return;
            case Opcodes.D2L /* 143 */:
                cast(Type.DOUBLE_TYPE, Type.LONG_TYPE);
                return;
            case Opcodes.D2F /* 144 */:
                cast(Type.DOUBLE_TYPE, Type.FLOAT_TYPE);
                return;
            case Opcodes.I2B /* 145 */:
                cast(Type.INT_TYPE, Type.BYTE_TYPE);
                return;
            case Opcodes.I2C /* 146 */:
                cast(Type.INT_TYPE, Type.CHAR_TYPE);
                return;
            case Opcodes.I2S /* 147 */:
                cast(Type.INT_TYPE, Type.SHORT_TYPE);
                return;
            case Opcodes.LCMP /* 148 */:
                lcmp();
                return;
            case Opcodes.FCMPL /* 149 */:
                cmpl(Type.FLOAT_TYPE);
                return;
            case Opcodes.FCMPG /* 150 */:
                cmpg(Type.FLOAT_TYPE);
                return;
            case Opcodes.DCMPL /* 151 */:
                cmpl(Type.DOUBLE_TYPE);
                return;
            case Opcodes.DCMPG /* 152 */:
                cmpg(Type.DOUBLE_TYPE);
                return;
            case Opcodes.IRETURN /* 172 */:
                areturn(Type.INT_TYPE);
                return;
            case Opcodes.LRETURN /* 173 */:
                areturn(Type.LONG_TYPE);
                return;
            case Opcodes.FRETURN /* 174 */:
                areturn(Type.FLOAT_TYPE);
                return;
            case Opcodes.DRETURN /* 175 */:
                areturn(Type.DOUBLE_TYPE);
                return;
            case Opcodes.ARETURN /* 176 */:
                areturn(OBJECT_TYPE);
                return;
            case Opcodes.RETURN /* 177 */:
                areturn(Type.VOID_TYPE);
                return;
            case Opcodes.ARRAYLENGTH /* 190 */:
                arraylength();
                return;
            case Opcodes.ATHROW /* 191 */:
                athrow();
                return;
            case Opcodes.MONITORENTER /* 194 */:
                monitorenter();
                return;
            case Opcodes.MONITOREXIT /* 195 */:
                monitorexit();
                return;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int opcode, int operand) {
        switch (opcode) {
            case 16:
                iconst(operand);
                return;
            case 17:
                iconst(operand);
                return;
            case Opcodes.NEWARRAY /* 188 */:
                switch (operand) {
                    case 4:
                        newarray(Type.BOOLEAN_TYPE);
                        return;
                    case 5:
                        newarray(Type.CHAR_TYPE);
                        return;
                    case 6:
                        newarray(Type.FLOAT_TYPE);
                        return;
                    case 7:
                        newarray(Type.DOUBLE_TYPE);
                        return;
                    case 8:
                        newarray(Type.BYTE_TYPE);
                        return;
                    case 9:
                        newarray(Type.SHORT_TYPE);
                        return;
                    case 10:
                        newarray(Type.INT_TYPE);
                        return;
                    case 11:
                        newarray(Type.LONG_TYPE);
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int opcode, int var) {
        switch (opcode) {
            case 21:
                load(var, Type.INT_TYPE);
                return;
            case 22:
                load(var, Type.LONG_TYPE);
                return;
            case 23:
                load(var, Type.FLOAT_TYPE);
                return;
            case 24:
                load(var, Type.DOUBLE_TYPE);
                return;
            case 25:
                load(var, OBJECT_TYPE);
                return;
            case 54:
                store(var, Type.INT_TYPE);
                return;
            case 55:
                store(var, Type.LONG_TYPE);
                return;
            case 56:
                store(var, Type.FLOAT_TYPE);
                return;
            case 57:
                store(var, Type.DOUBLE_TYPE);
                return;
            case 58:
                store(var, OBJECT_TYPE);
                return;
            case Opcodes.RET /* 169 */:
                ret(var);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int opcode, String type2) {
        Type objectType = Type.getObjectType(type2);
        switch (opcode) {
            case Opcodes.NEW /* 187 */:
                anew(objectType);
                return;
            case Opcodes.NEWARRAY /* 188 */:
            case Opcodes.ARRAYLENGTH /* 190 */:
            case Opcodes.ATHROW /* 191 */:
            default:
                throw new IllegalArgumentException();
            case Opcodes.ANEWARRAY /* 189 */:
                newarray(objectType);
                return;
            case Opcodes.CHECKCAST /* 192 */:
                checkcast(objectType);
                return;
            case Opcodes.INSTANCEOF /* 193 */:
                instanceOf(objectType);
                return;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
        switch (opcode) {
            case Opcodes.GETSTATIC /* 178 */:
                getstatic(owner, name, descriptor);
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                putstatic(owner, name, descriptor);
                return;
            case Opcodes.GETFIELD /* 180 */:
                getfield(owner, name, descriptor);
                return;
            case Opcodes.PUTFIELD /* 181 */:
                putfield(owner, name, descriptor);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int opcodeAndSource, String owner, String name, String descriptor, boolean isInterface) {
        if (this.api < 327680 && (opcodeAndSource & 256) == 0) {
            super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
            return;
        }
        int opcode = opcodeAndSource & (-257);
        switch (opcode) {
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                invokevirtual(owner, name, descriptor, isInterface);
                return;
            case Opcodes.INVOKESPECIAL /* 183 */:
                invokespecial(owner, name, descriptor, isInterface);
                return;
            case Opcodes.INVOKESTATIC /* 184 */:
                invokestatic(owner, name, descriptor, isInterface);
                return;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                invokeinterface(owner, name, descriptor);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
        invokedynamic(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int opcode, Label label) {
        switch (opcode) {
            case 153:
                ifeq(label);
                return;
            case 154:
                ifne(label);
                return;
            case 155:
                iflt(label);
                return;
            case 156:
                ifge(label);
                return;
            case 157:
                ifgt(label);
                return;
            case 158:
                ifle(label);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                ificmpeq(label);
                return;
            case Opcodes.IF_ICMPNE /* 160 */:
                ificmpne(label);
                return;
            case Opcodes.IF_ICMPLT /* 161 */:
                ificmplt(label);
                return;
            case Opcodes.IF_ICMPGE /* 162 */:
                ificmpge(label);
                return;
            case Opcodes.IF_ICMPGT /* 163 */:
                ificmpgt(label);
                return;
            case Opcodes.IF_ICMPLE /* 164 */:
                ificmple(label);
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
                ifacmpeq(label);
                return;
            case Opcodes.IF_ACMPNE /* 166 */:
                ifacmpne(label);
                return;
            case Opcodes.GOTO /* 167 */:
                goTo(label);
                return;
            case Opcodes.JSR /* 168 */:
                jsr(label);
                return;
            case Opcodes.RET /* 169 */:
            case Opcodes.TABLESWITCH /* 170 */:
            case Opcodes.LOOKUPSWITCH /* 171 */:
            case Opcodes.IRETURN /* 172 */:
            case Opcodes.LRETURN /* 173 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.DRETURN /* 175 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.RETURN /* 177 */:
            case Opcodes.GETSTATIC /* 178 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.GETFIELD /* 180 */:
            case Opcodes.PUTFIELD /* 181 */:
            case Opcodes.INVOKEVIRTUAL /* 182 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.INVOKESTATIC /* 184 */:
            case Opcodes.INVOKEINTERFACE /* 185 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case Opcodes.NEW /* 187 */:
            case Opcodes.NEWARRAY /* 188 */:
            case Opcodes.ANEWARRAY /* 189 */:
            case Opcodes.ARRAYLENGTH /* 190 */:
            case Opcodes.ATHROW /* 191 */:
            case Opcodes.CHECKCAST /* 192 */:
            case Opcodes.INSTANCEOF /* 193 */:
            case Opcodes.MONITORENTER /* 194 */:
            case Opcodes.MONITOREXIT /* 195 */:
            case 196:
            case Opcodes.MULTIANEWARRAY /* 197 */:
            default:
                throw new IllegalArgumentException();
            case Opcodes.IFNULL /* 198 */:
                ifnull(label);
                return;
            case Opcodes.IFNONNULL /* 199 */:
                ifnonnull(label);
                return;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        mark(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object value) {
        if (this.api < 327680 && ((value instanceof Handle) || ((value instanceof Type) && ((Type) value).getSort() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (this.api < 458752 && (value instanceof ConstantDynamic)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        if (value instanceof Integer) {
            iconst(((Integer) value).intValue());
            return;
        }
        if (value instanceof Byte) {
            iconst(((Byte) value).intValue());
            return;
        }
        if (value instanceof Character) {
            iconst(((Character) value).charValue());
            return;
        }
        if (value instanceof Short) {
            iconst(((Short) value).intValue());
            return;
        }
        if (value instanceof Boolean) {
            iconst(((Boolean) value).booleanValue() ? 1 : 0);
            return;
        }
        if (value instanceof Float) {
            fconst(((Float) value).floatValue());
            return;
        }
        if (value instanceof Long) {
            lconst(((Long) value).longValue());
            return;
        }
        if (value instanceof Double) {
            dconst(((Double) value).doubleValue());
            return;
        }
        if (value instanceof String) {
            aconst(value);
            return;
        }
        if (value instanceof Type) {
            tconst((Type) value);
        } else if (value instanceof Handle) {
            hconst((Handle) value);
        } else {
            if (value instanceof ConstantDynamic) {
                cconst((ConstantDynamic) value);
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int var, int increment) {
        iinc(var, increment);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
        tableswitch(min, max, dflt, labels);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        lookupswitch(dflt, keys, labels);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String descriptor, int numDimensions) {
        multianewarray(descriptor, numDimensions);
    }

    public void nop() {
        this.mv.visitInsn(0);
    }

    public void aconst(Object value) {
        if (value == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(value);
        }
    }

    public void iconst(int intValue) {
        if (intValue >= -1 && intValue <= 5) {
            this.mv.visitInsn(3 + intValue);
            return;
        }
        if (intValue >= -128 && intValue <= 127) {
            this.mv.visitIntInsn(16, intValue);
        } else if (intValue >= -32768 && intValue <= 32767) {
            this.mv.visitIntInsn(17, intValue);
        } else {
            this.mv.visitLdcInsn(Integer.valueOf(intValue));
        }
    }

    public void lconst(long longValue) {
        if (longValue == 0 || longValue == 1) {
            this.mv.visitInsn(9 + ((int) longValue));
        } else {
            this.mv.visitLdcInsn(Long.valueOf(longValue));
        }
    }

    public void fconst(float floatValue) {
        int bits = Float.floatToIntBits(floatValue);
        if (bits == 0 || bits == 1065353216 || bits == 1073741824) {
            this.mv.visitInsn(11 + ((int) floatValue));
        } else {
            this.mv.visitLdcInsn(Float.valueOf(floatValue));
        }
    }

    public void dconst(double doubleValue) {
        long bits = Double.doubleToLongBits(doubleValue);
        if (bits == 0 || bits == 4607182418800017408L) {
            this.mv.visitInsn(14 + ((int) doubleValue));
        } else {
            this.mv.visitLdcInsn(Double.valueOf(doubleValue));
        }
    }

    public void tconst(Type type2) {
        this.mv.visitLdcInsn(type2);
    }

    public void hconst(Handle handle) {
        this.mv.visitLdcInsn(handle);
    }

    public void cconst(ConstantDynamic constantDynamic) {
        this.mv.visitLdcInsn(constantDynamic);
    }

    public void load(int var, Type type2) {
        this.mv.visitVarInsn(type2.getOpcode(21), var);
    }

    public void aload(Type type2) {
        this.mv.visitInsn(type2.getOpcode(46));
    }

    public void store(int var, Type type2) {
        this.mv.visitVarInsn(type2.getOpcode(54), var);
    }

    public void astore(Type type2) {
        this.mv.visitInsn(type2.getOpcode(79));
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void dup() {
        this.mv.visitInsn(89);
    }

    public void dup2() {
        this.mv.visitInsn(92);
    }

    public void dupX1() {
        this.mv.visitInsn(90);
    }

    public void dupX2() {
        this.mv.visitInsn(91);
    }

    public void dup2X1() {
        this.mv.visitInsn(93);
    }

    public void dup2X2() {
        this.mv.visitInsn(94);
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void add(Type type2) {
        this.mv.visitInsn(type2.getOpcode(96));
    }

    public void sub(Type type2) {
        this.mv.visitInsn(type2.getOpcode(100));
    }

    public void mul(Type type2) {
        this.mv.visitInsn(type2.getOpcode(104));
    }

    public void div(Type type2) {
        this.mv.visitInsn(type2.getOpcode(108));
    }

    public void rem(Type type2) {
        this.mv.visitInsn(type2.getOpcode(112));
    }

    public void neg(Type type2) {
        this.mv.visitInsn(type2.getOpcode(116));
    }

    public void shl(Type type2) {
        this.mv.visitInsn(type2.getOpcode(120));
    }

    public void shr(Type type2) {
        this.mv.visitInsn(type2.getOpcode(122));
    }

    public void ushr(Type type2) {
        this.mv.visitInsn(type2.getOpcode(124));
    }

    public void and(Type type2) {
        this.mv.visitInsn(type2.getOpcode(126));
    }

    public void or(Type type2) {
        this.mv.visitInsn(type2.getOpcode(128));
    }

    public void xor(Type type2) {
        this.mv.visitInsn(type2.getOpcode(130));
    }

    public void iinc(int var, int increment) {
        this.mv.visitIincInsn(var, increment);
    }

    public void cast(Type from, Type to) {
        cast(this.mv, from, to);
    }

    static void cast(MethodVisitor methodVisitor, Type from, Type to) {
        if (from != to) {
            if (from == Type.DOUBLE_TYPE) {
                if (to == Type.FLOAT_TYPE) {
                    methodVisitor.visitInsn(Opcodes.D2F);
                    return;
                } else if (to == Type.LONG_TYPE) {
                    methodVisitor.visitInsn(Opcodes.D2L);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.D2I);
                    cast(methodVisitor, Type.INT_TYPE, to);
                    return;
                }
            }
            if (from == Type.FLOAT_TYPE) {
                if (to == Type.DOUBLE_TYPE) {
                    methodVisitor.visitInsn(Opcodes.F2D);
                    return;
                } else if (to == Type.LONG_TYPE) {
                    methodVisitor.visitInsn(Opcodes.F2L);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.F2I);
                    cast(methodVisitor, Type.INT_TYPE, to);
                    return;
                }
            }
            if (from == Type.LONG_TYPE) {
                if (to == Type.DOUBLE_TYPE) {
                    methodVisitor.visitInsn(Opcodes.L2D);
                    return;
                } else if (to == Type.FLOAT_TYPE) {
                    methodVisitor.visitInsn(Opcodes.L2F);
                    return;
                } else {
                    methodVisitor.visitInsn(Opcodes.L2I);
                    cast(methodVisitor, Type.INT_TYPE, to);
                    return;
                }
            }
            if (to == Type.BYTE_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2B);
                return;
            }
            if (to == Type.CHAR_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2C);
                return;
            }
            if (to == Type.DOUBLE_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2D);
                return;
            }
            if (to == Type.FLOAT_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2F);
            } else if (to == Type.LONG_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2L);
            } else if (to == Type.SHORT_TYPE) {
                methodVisitor.visitInsn(Opcodes.I2S);
            }
        }
    }

    public void lcmp() {
        this.mv.visitInsn(Opcodes.LCMP);
    }

    public void cmpl(Type type2) {
        this.mv.visitInsn(type2 == Type.FLOAT_TYPE ? Opcodes.FCMPL : Opcodes.DCMPL);
    }

    public void cmpg(Type type2) {
        this.mv.visitInsn(type2 == Type.FLOAT_TYPE ? Opcodes.FCMPG : Opcodes.DCMPG);
    }

    public void ifeq(Label label) {
        this.mv.visitJumpInsn(153, label);
    }

    public void ifne(Label label) {
        this.mv.visitJumpInsn(154, label);
    }

    public void iflt(Label label) {
        this.mv.visitJumpInsn(155, label);
    }

    public void ifge(Label label) {
        this.mv.visitJumpInsn(156, label);
    }

    public void ifgt(Label label) {
        this.mv.visitJumpInsn(157, label);
    }

    public void ifle(Label label) {
        this.mv.visitJumpInsn(158, label);
    }

    public void ificmpeq(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPEQ, label);
    }

    public void ificmpne(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPNE, label);
    }

    public void ificmplt(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPLT, label);
    }

    public void ificmpge(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPGE, label);
    }

    public void ificmpgt(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPGT, label);
    }

    public void ificmple(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ICMPLE, label);
    }

    public void ifacmpeq(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ACMPEQ, label);
    }

    public void ifacmpne(Label label) {
        this.mv.visitJumpInsn(Opcodes.IF_ACMPNE, label);
    }

    public void goTo(Label label) {
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    public void jsr(Label label) {
        this.mv.visitJumpInsn(Opcodes.JSR, label);
    }

    public void ret(int var) {
        this.mv.visitVarInsn(Opcodes.RET, var);
    }

    public void tableswitch(int min, int max, Label dflt, Label... labels) {
        this.mv.visitTableSwitchInsn(min, max, dflt, labels);
    }

    public void lookupswitch(Label dflt, int[] keys, Label[] labels) {
        this.mv.visitLookupSwitchInsn(dflt, keys, labels);
    }

    public void areturn(Type type2) {
        this.mv.visitInsn(type2.getOpcode(Opcodes.IRETURN));
    }

    public void getstatic(String owner, String name, String descriptor) {
        this.mv.visitFieldInsn(Opcodes.GETSTATIC, owner, name, descriptor);
    }

    public void putstatic(String owner, String name, String descriptor) {
        this.mv.visitFieldInsn(Opcodes.PUTSTATIC, owner, name, descriptor);
    }

    public void getfield(String owner, String name, String descriptor) {
        this.mv.visitFieldInsn(Opcodes.GETFIELD, owner, name, descriptor);
    }

    public void putfield(String owner, String name, String descriptor) {
        this.mv.visitFieldInsn(Opcodes.PUTFIELD, owner, name, descriptor);
    }

    @Deprecated
    public void invokevirtual(String owner, String name, String descriptor) {
        if (this.api >= 327680) {
            invokevirtual(owner, name, descriptor, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, owner, name, descriptor);
        }
    }

    public void invokevirtual(String owner, String name, String descriptor, boolean isInterface) {
        if (this.api < 327680) {
            if (isInterface) {
                throw new UnsupportedOperationException("INVOKEVIRTUAL on interfaces require ASM 5");
            }
            invokevirtual(owner, name, descriptor);
            return;
        }
        this.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, owner, name, descriptor, isInterface);
    }

    @Deprecated
    public void invokespecial(String owner, String name, String descriptor) {
        if (this.api >= 327680) {
            invokespecial(owner, name, descriptor, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, owner, name, descriptor, false);
        }
    }

    public void invokespecial(String owner, String name, String descriptor, boolean isInterface) {
        if (this.api < 327680) {
            if (isInterface) {
                throw new UnsupportedOperationException("INVOKESPECIAL on interfaces require ASM 5");
            }
            invokespecial(owner, name, descriptor);
            return;
        }
        this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, owner, name, descriptor, isInterface);
    }

    @Deprecated
    public void invokestatic(String owner, String name, String descriptor) {
        if (this.api >= 327680) {
            invokestatic(owner, name, descriptor, false);
        } else {
            this.mv.visitMethodInsn(Opcodes.INVOKESTATIC, owner, name, descriptor, false);
        }
    }

    public void invokestatic(String owner, String name, String descriptor, boolean isInterface) {
        if (this.api < 327680) {
            if (isInterface) {
                throw new UnsupportedOperationException("INVOKESTATIC on interfaces require ASM 5");
            }
            invokestatic(owner, name, descriptor);
            return;
        }
        this.mv.visitMethodInsn(Opcodes.INVOKESTATIC, owner, name, descriptor, isInterface);
    }

    public void invokeinterface(String owner, String name, String descriptor) {
        this.mv.visitMethodInsn(Opcodes.INVOKEINTERFACE, owner, name, descriptor, true);
    }

    public void invokedynamic(String name, String descriptor, Handle bootstrapMethodHandle, Object[] bootstrapMethodArguments) {
        this.mv.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
    }

    public void anew(Type type2) {
        this.mv.visitTypeInsn(Opcodes.NEW, type2.getInternalName());
    }

    public void newarray(Type type2) {
        newarray(this.mv, type2);
    }

    static void newarray(MethodVisitor methodVisitor, Type type2) {
        int arrayType;
        switch (type2.getSort()) {
            case 1:
                arrayType = 4;
                break;
            case 2:
                arrayType = 5;
                break;
            case 3:
                arrayType = 8;
                break;
            case 4:
                arrayType = 9;
                break;
            case 5:
                arrayType = 10;
                break;
            case 6:
                arrayType = 6;
                break;
            case 7:
                arrayType = 11;
                break;
            case 8:
                arrayType = 7;
                break;
            default:
                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, type2.getInternalName());
                return;
        }
        methodVisitor.visitIntInsn(Opcodes.NEWARRAY, arrayType);
    }

    public void arraylength() {
        this.mv.visitInsn(Opcodes.ARRAYLENGTH);
    }

    public void athrow() {
        this.mv.visitInsn(Opcodes.ATHROW);
    }

    public void checkcast(Type type2) {
        this.mv.visitTypeInsn(Opcodes.CHECKCAST, type2.getInternalName());
    }

    public void instanceOf(Type type2) {
        this.mv.visitTypeInsn(Opcodes.INSTANCEOF, type2.getInternalName());
    }

    public void monitorenter() {
        this.mv.visitInsn(Opcodes.MONITORENTER);
    }

    public void monitorexit() {
        this.mv.visitInsn(Opcodes.MONITOREXIT);
    }

    public void multianewarray(String descriptor, int numDimensions) {
        this.mv.visitMultiANewArrayInsn(descriptor, numDimensions);
    }

    public void ifnull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNULL, label);
    }

    public void ifnonnull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNONNULL, label);
    }

    public void mark(Label label) {
        this.mv.visitLabel(label);
    }
}
