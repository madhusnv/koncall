package org.objectweb.asm.commons;

import com.google.api.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

/* loaded from: salesmax.apk:org/objectweb/asm/commons/AdviceAdapter.SCL.lombok */
public abstract class AdviceAdapter extends GeneratorAdapter implements Opcodes {
    private static final Object UNINITIALIZED_THIS = new Object();
    private static final Object OTHER = new Object();
    private static final String INVALID_OPCODE = "Invalid opcode ";
    protected int methodAccess;
    protected String methodDesc;
    private final boolean isConstructor;
    private boolean superClassConstructorCalled;
    private List<Object> stackFrame;
    private Map<Label, List<Object>> forwardJumpStackFrames;

    protected AdviceAdapter(int api, MethodVisitor methodVisitor, int access, String name, String descriptor) {
        super(api, methodVisitor, access, name, descriptor);
        this.methodAccess = access;
        this.methodDesc = descriptor;
        this.isConstructor = "<init>".equals(name);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        super.visitCode();
        if (this.isConstructor) {
            this.stackFrame = new ArrayList();
            this.forwardJumpStackFrames = new HashMap();
        } else {
            onMethodEnter();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        List<Object> labelStackFrame;
        super.visitLabel(label);
        if (this.isConstructor && this.forwardJumpStackFrames != null && (labelStackFrame = this.forwardJumpStackFrames.get(label)) != null) {
            this.stackFrame = labelStackFrame;
            this.superClassConstructorCalled = false;
            this.forwardJumpStackFrames.remove(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int opcode) {
        if (this.isConstructor && !this.superClassConstructorCalled) {
            switch (opcode) {
                case 0:
                case 47:
                case 49:
                case 116:
                case Opcodes.LNEG /* 117 */:
                case Opcodes.FNEG /* 118 */:
                case Opcodes.DNEG /* 119 */:
                case Opcodes.I2F /* 134 */:
                case Opcodes.L2D /* 138 */:
                case Opcodes.F2I /* 139 */:
                case Opcodes.D2L /* 143 */:
                case Opcodes.I2B /* 145 */:
                case Opcodes.I2C /* 146 */:
                case Opcodes.I2S /* 147 */:
                case Opcodes.ARRAYLENGTH /* 190 */:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case Opcodes.I2L /* 133 */:
                case Opcodes.I2D /* 135 */:
                case Opcodes.F2L /* 140 */:
                case Opcodes.F2D /* 141 */:
                    pushValue(OTHER);
                    break;
                case 9:
                case 10:
                case 14:
                case 15:
                    pushValue(OTHER);
                    pushValue(OTHER);
                    break;
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
                    throw new IllegalArgumentException(INVALID_OPCODE + opcode);
                case 46:
                case 48:
                case 50:
                case 51:
                case 52:
                case 53:
                case Opcodes.POP /* 87 */:
                case 96:
                case Opcodes.FADD /* 98 */:
                case 100:
                case 102:
                case 104:
                case Opcodes.FMUL /* 106 */:
                case 108:
                case 110:
                case 112:
                case Opcodes.FREM /* 114 */:
                case 120:
                case Opcodes.LSHL /* 121 */:
                case 122:
                case Opcodes.LSHR /* 123 */:
                case 124:
                case Opcodes.LUSHR /* 125 */:
                case 126:
                case 128:
                case 130:
                case Opcodes.L2I /* 136 */:
                case Opcodes.L2F /* 137 */:
                case Opcodes.D2I /* 142 */:
                case Opcodes.D2F /* 144 */:
                case Opcodes.FCMPL /* 149 */:
                case Opcodes.FCMPG /* 150 */:
                case Opcodes.MONITORENTER /* 194 */:
                case Opcodes.MONITOREXIT /* 195 */:
                    popValue();
                    break;
                case Opcodes.IASTORE /* 79 */:
                case Opcodes.FASTORE /* 81 */:
                case Opcodes.AASTORE /* 83 */:
                case Opcodes.BASTORE /* 84 */:
                case Opcodes.CASTORE /* 85 */:
                case 86:
                case Opcodes.LCMP /* 148 */:
                case Opcodes.DCMPL /* 151 */:
                case Opcodes.DCMPG /* 152 */:
                    popValue();
                    popValue();
                    popValue();
                    break;
                case 80:
                case Opcodes.DASTORE /* 82 */:
                    popValue();
                    popValue();
                    popValue();
                    popValue();
                    break;
                case Opcodes.POP2 /* 88 */:
                case Opcodes.LADD /* 97 */:
                case Opcodes.DADD /* 99 */:
                case 101:
                case 103:
                case 105:
                case Opcodes.DMUL /* 107 */:
                case Opcodes.LDIV /* 109 */:
                case Opcodes.DDIV /* 111 */:
                case Opcodes.LREM /* 113 */:
                case Opcodes.DREM /* 115 */:
                case Opcodes.LAND /* 127 */:
                case Opcodes.LOR /* 129 */:
                case Opcodes.LXOR /* 131 */:
                    popValue();
                    popValue();
                    break;
                case Opcodes.DUP /* 89 */:
                    pushValue(peekValue());
                    break;
                case Opcodes.DUP_X1 /* 90 */:
                    int stackSize = this.stackFrame.size();
                    this.stackFrame.add(stackSize - 2, this.stackFrame.get(stackSize - 1));
                    break;
                case Opcodes.DUP_X2 /* 91 */:
                    int stackSize2 = this.stackFrame.size();
                    this.stackFrame.add(stackSize2 - 3, this.stackFrame.get(stackSize2 - 1));
                    break;
                case Opcodes.DUP2 /* 92 */:
                    int stackSize3 = this.stackFrame.size();
                    this.stackFrame.add(stackSize3 - 2, this.stackFrame.get(stackSize3 - 1));
                    this.stackFrame.add(stackSize3 - 2, this.stackFrame.get(stackSize3 - 1));
                    break;
                case Opcodes.DUP2_X1 /* 93 */:
                    int stackSize4 = this.stackFrame.size();
                    this.stackFrame.add(stackSize4 - 3, this.stackFrame.get(stackSize4 - 1));
                    this.stackFrame.add(stackSize4 - 3, this.stackFrame.get(stackSize4 - 1));
                    break;
                case Opcodes.DUP2_X2 /* 94 */:
                    int stackSize5 = this.stackFrame.size();
                    this.stackFrame.add(stackSize5 - 4, this.stackFrame.get(stackSize5 - 1));
                    this.stackFrame.add(stackSize5 - 4, this.stackFrame.get(stackSize5 - 1));
                    break;
                case Opcodes.SWAP /* 95 */:
                    int stackSize6 = this.stackFrame.size();
                    this.stackFrame.add(stackSize6 - 2, this.stackFrame.get(stackSize6 - 1));
                    this.stackFrame.remove(stackSize6);
                    break;
                case Opcodes.IRETURN /* 172 */:
                case Opcodes.LRETURN /* 173 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                    throw new IllegalArgumentException("Invalid return in constructor");
                case Opcodes.RETURN /* 177 */:
                    onMethodExit(opcode);
                    endConstructorBasicBlockWithoutSuccessor();
                    break;
                case Opcodes.ATHROW /* 191 */:
                    popValue();
                    onMethodExit(opcode);
                    endConstructorBasicBlockWithoutSuccessor();
                    break;
            }
        } else {
            switch (opcode) {
                case Opcodes.IRETURN /* 172 */:
                case Opcodes.LRETURN /* 173 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.RETURN /* 177 */:
                case Opcodes.ATHROW /* 191 */:
                    onMethodExit(opcode);
                    break;
            }
        }
        super.visitInsn(opcode);
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter, org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int opcode, int var) {
        super.visitVarInsn(opcode, var);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            switch (opcode) {
                case 21:
                case 23:
                    pushValue(OTHER);
                    return;
                case 22:
                case 24:
                    pushValue(OTHER);
                    pushValue(OTHER);
                    return;
                case 25:
                    pushValue(var == 0 ? UNINITIALIZED_THIS : OTHER);
                    return;
                case 54:
                case 56:
                case 58:
                    popValue();
                    return;
                case 55:
                case 57:
                    popValue();
                    popValue();
                    return;
                case Opcodes.RET /* 169 */:
                    endConstructorBasicBlockWithoutSuccessor();
                    return;
                default:
                    throw new IllegalArgumentException(INVALID_OPCODE + opcode);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
        super.visitFieldInsn(opcode, owner, name, descriptor);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            char firstDescriptorChar = descriptor.charAt(0);
            boolean longOrDouble = firstDescriptorChar == 'J' || firstDescriptorChar == 'D';
            switch (opcode) {
                case Opcodes.GETSTATIC /* 178 */:
                    pushValue(OTHER);
                    if (longOrDouble) {
                        pushValue(OTHER);
                        return;
                    }
                    return;
                case Opcodes.PUTSTATIC /* 179 */:
                    popValue();
                    if (longOrDouble) {
                        popValue();
                        return;
                    }
                    return;
                case Opcodes.GETFIELD /* 180 */:
                    if (longOrDouble) {
                        pushValue(OTHER);
                        return;
                    }
                    return;
                case Opcodes.PUTFIELD /* 181 */:
                    popValue();
                    popValue();
                    if (longOrDouble) {
                        popValue();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException(INVALID_OPCODE + opcode);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int opcode, int operand) {
        super.visitIntInsn(opcode, operand);
        if (this.isConstructor && !this.superClassConstructorCalled && opcode != 188) {
            pushValue(OTHER);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object value) {
        super.visitLdcInsn(value);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            pushValue(OTHER);
            if ((value instanceof Double) || (value instanceof Long) || ((value instanceof ConstantDynamic) && ((ConstantDynamic) value).getSize() == 2)) {
                pushValue(OTHER);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String descriptor, int numDimensions) {
        super.visitMultiANewArrayInsn(descriptor, numDimensions);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            for (int i = 0; i < numDimensions; i++) {
                popValue();
            }
            pushValue(OTHER);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int opcode, String type2) {
        super.visitTypeInsn(opcode, type2);
        if (this.isConstructor && !this.superClassConstructorCalled && opcode == 187) {
            pushValue(OTHER);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int opcodeAndSource, String owner, String name, String descriptor, boolean isInterface) {
        if (this.api < 327680 && (opcodeAndSource & 256) == 0) {
            super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
            return;
        }
        super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
        int opcode = opcodeAndSource & (-257);
        doVisitMethodInsn(opcode, name, descriptor);
    }

    private void doVisitMethodInsn(int opcode, String name, String descriptor) {
        if (this.isConstructor && !this.superClassConstructorCalled) {
            for (Type argumentType : Type.getArgumentTypes(descriptor)) {
                popValue();
                if (argumentType.getSize() == 2) {
                    popValue();
                }
            }
            switch (opcode) {
                case Opcodes.INVOKEVIRTUAL /* 182 */:
                case Opcodes.INVOKEINTERFACE /* 185 */:
                    popValue();
                    break;
                case Opcodes.INVOKESPECIAL /* 183 */:
                    Object value = popValue();
                    if (value == UNINITIALIZED_THIS && !this.superClassConstructorCalled && name.equals("<init>")) {
                        this.superClassConstructorCalled = true;
                        onMethodEnter();
                        break;
                    }
                    break;
            }
            Type returnType = Type.getReturnType(descriptor);
            if (returnType != Type.VOID_TYPE) {
                pushValue(OTHER);
                if (returnType.getSize() == 2) {
                    pushValue(OTHER);
                }
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
        super.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
        doVisitMethodInsn(Opcodes.INVOKEDYNAMIC, name, descriptor);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int opcode, Label label) {
        super.visitJumpInsn(opcode, label);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            switch (opcode) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case Opcodes.IFNULL /* 198 */:
                case Opcodes.IFNONNULL /* 199 */:
                    popValue();
                    break;
                case Opcodes.IF_ICMPEQ /* 159 */:
                case Opcodes.IF_ICMPNE /* 160 */:
                case Opcodes.IF_ICMPLT /* 161 */:
                case Opcodes.IF_ICMPGE /* 162 */:
                case Opcodes.IF_ICMPGT /* 163 */:
                case Opcodes.IF_ICMPLE /* 164 */:
                case Opcodes.IF_ACMPEQ /* 165 */:
                case Opcodes.IF_ACMPNE /* 166 */:
                    popValue();
                    popValue();
                    break;
                case Opcodes.GOTO /* 167 */:
                    endConstructorBasicBlockWithoutSuccessor();
                    break;
                case Opcodes.JSR /* 168 */:
                    pushValue(OTHER);
                    break;
            }
            addForwardJump(label);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        super.visitLookupSwitchInsn(dflt, keys, labels);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            popValue();
            addForwardJumps(dflt, labels);
            endConstructorBasicBlockWithoutSuccessor();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
        super.visitTableSwitchInsn(min, max, dflt, labels);
        if (this.isConstructor && !this.superClassConstructorCalled) {
            popValue();
            addForwardJumps(dflt, labels);
            endConstructorBasicBlockWithoutSuccessor();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label start, Label end, Label handler, String type2) {
        super.visitTryCatchBlock(start, end, handler, type2);
        if (this.isConstructor && !this.forwardJumpStackFrames.containsKey(handler)) {
            List<Object> handlerStackFrame = new ArrayList<>();
            handlerStackFrame.add(OTHER);
            this.forwardJumpStackFrames.put(handler, handlerStackFrame);
        }
    }

    private void addForwardJumps(Label dflt, Label[] labels) {
        addForwardJump(dflt);
        for (Label label : labels) {
            addForwardJump(label);
        }
    }

    private void addForwardJump(Label label) {
        if (this.forwardJumpStackFrames.containsKey(label)) {
            return;
        }
        this.forwardJumpStackFrames.put(label, new ArrayList(this.stackFrame));
    }

    private void endConstructorBasicBlockWithoutSuccessor() {
        this.superClassConstructorCalled = true;
    }

    private Object popValue() {
        return this.stackFrame.remove(this.stackFrame.size() - 1);
    }

    private Object peekValue() {
        return this.stackFrame.get(this.stackFrame.size() - 1);
    }

    private void pushValue(Object value) {
        this.stackFrame.add(value);
    }

    protected void onMethodEnter() {
    }

    protected void onMethodExit(int opcode) {
    }
}
