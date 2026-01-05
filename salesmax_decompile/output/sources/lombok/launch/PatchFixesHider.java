package lombok.launch;

import ai.salesmax.model.AutoCallConfig;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation;
import com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery;
import com.amazonaws.amplify.generated.graphql.GetWebInitiatedCallQuery;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions;
import com.amplifyframework.predictions.options.FaceLivenessSessionOptions;
import com.apollographql.apollo.api.ResponseReader;
import j$.time.Instant;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import lombok.eclipse.EcjAugments;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.internal.compiler.ast.ASTNode;
import org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration;
import org.eclipse.jdt.internal.compiler.ast.Expression;
import org.eclipse.jdt.internal.compiler.ast.LocalDeclaration;
import org.eclipse.jdt.internal.compiler.ast.TypeDeclaration;
import org.eclipse.jdt.internal.compiler.lookup.BlockScope;
import org.eclipse.jdt.internal.compiler.lookup.TypeBinding;
import p001o.id5;
import type.CreateAccountSubscriptionBillCycleInput;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider.SCL.lombok */
public final class PatchFixesHider {
    PatchFixesHider() {
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$Util.SCL.lombok */
    public static final class Util {
        private static ClassLoader shadowLoader;

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        public Util(java.lang.String r3) {
            /*
                r2 = this;
                r0 = r2
                r0.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.nextBillDate(java.lang.String):type.CreateAccountSubscriptionBillCycleInput$Builder");
        }

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        public static type.CreateAccountSubscriptionBillCycleInput.Builder period(java.lang.String r2) {
            /*
                java.lang.ClassLoader r0 = lombok.launch.PatchFixesHider.Util.shadowLoader
                if (r0 != 0) goto L1e
                java.lang.String r0 = "lombok.core.LombokNode"
                type.Day r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.Mapper.C45023.read(r0)     // Catch: java.lang.ClassNotFoundException -> L17
                java.lang.Class<lombok.launch.PatchFixesHider$Util> r0 = lombok.launch.PatchFixesHider.Util.class
                java.lang.String r0 = r0.read(r0)     // Catch: java.lang.ClassNotFoundException -> L17
                lombok.launch.PatchFixesHider.Util.shadowLoader = r0     // Catch: java.lang.ClassNotFoundException -> L17
                goto L1e
            L17:
                java.lang.String r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.Mapper.C45056.read(r0)
                lombok.launch.PatchFixesHider.Util.shadowLoader = r0
            L1e:
                java.lang.ClassLoader r0 = lombok.launch.PatchFixesHider.Util.shadowLoader
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.period(java.lang.String):type.CreateAccountSubscriptionBillCycleInput$Builder");
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)Ljava/lang/Class<*>; */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String, type.CreateAccountSubscriptionBillCycleInput$Builder] */
        public static CreateAccountSubscriptionBillCycleInput.Builder productAccountId(String name) {
            try {
                DeleteEntityListMembershipMutation.Contact.addedById();
                return DeleteEntityListMembershipMutation.Contact.assignmentMethod();
            } catch (ClassNotFoundException e) {
                throw DeleteEntityListMembershipMutation.Contact.blockedForCallReason();
            }
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method; */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0001: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('name' java.lang.String)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0002: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('parameterTypes' java.lang.Class[])]), block:B:2:0x0000 */
        public static type.CreateAccountSubscriptionBillCycleInput.Builder updatedAt(java.lang.String r4) {
            /*
                r0 = r4
                r1 = r5
                r2 = r6
                type.ContactStatus r0 = r0.contactStatus()     // Catch: java.lang.NoSuchMethodException -> L7
                return r0
            L7:
                r7 = move-exception
                r0 = r7
                java.lang.String r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.blockedForCallReason()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.updatedAt(java.lang.String):type.CreateAccountSubscriptionBillCycleInput$Builder");
        }

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method; */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68966init(
        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r7v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/String;)Ljava/lang/reflect/Method; */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0014: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('name' java.lang.String)]), block:B:3:0x000f */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0041: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('name' java.lang.String)]), block:B:10:0x002a */
        /* renamed from: a */
        public static java.lang.String m16276a(type.CreateAccountSubscriptionBillCycleInput r6) {
            /*
                r0 = r6
                java.lang.String r0 = r0.isCustomer()
                r1 = r0
                r11 = r1
                int r0 = r0.length
                r10 = r0
                r0 = 0
                r9 = r0
                goto L24
            Lf:
                r0 = r11
                r1 = r9
                r0 = r0[r1]
                r8 = r0
                r0 = r7
                r1 = r8
                java.lang.Integer r1 = r1.lastCallDuration()
                java.lang.String r0 = r0.lastClosedTaskDetail()
                if (r0 == 0) goto L21
                r0 = r8
                return r0
            L21:
                int r9 = r9 + 1
            L24:
                r0 = r9
                r1 = r10
                if (r0 < r1) goto Lf
                java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r4 = r6
                java.lang.String r4 = r4.lastRepeatEnquiryDate()
                java.lang.String r4 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.lastRepeatEnquirySource()
                super/*com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact*/.lastTaskDoneEngagementId()
                java.lang.String r3 = "::"
                java.lang.String r2 = r2.lastVisitOutcomeNature()
                r3 = r7
                java.lang.String r2 = r2.lastVisitOutcomeNature()
                java.lang.String r2 = r2.lastWabaBroadcastReplyTime()
                super/*com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact*/.lastWabaBroadcastTemplate()
                java.lang.String r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.blockedForCallReason()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.m16276a(type.CreateAccountSubscriptionBillCycleInput):java.lang.String");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' java.lang.reflect.Method)]) A[TRY_ENTER] (LINE:129), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0002: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('args' java.lang.Object[])]), block:B:2:0x0000 */
        public static java.lang.String accountId() {
            /*
                r0 = r4
                r1 = 0
                r2 = r5
                java.lang.String r0 = r0.movedToClosedOn()     // Catch: java.lang.IllegalAccessException -> L7 java.lang.reflect.InvocationTargetException -> Ld
                return r0
            L7:
                r6 = move-exception
                r0 = r6
                java.lang.String r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.blockedForCallReason()
                throw r0
            Ld:
                r6 = move-exception
                r0 = r6
                java.lang.String r0 = r0.needFollowUpTagUpdatedAt()
                java.lang.String r0 = com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.blockedForCallReason()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.accountId():java.lang.String");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('t' java.lang.Throwable)]) (LINE:138), block:B:2:0x0000 */
        private static java.lang.String addedById() {
            /*
                r0 = r4
                if (r0 != 0) goto Le
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "t"
                super/*com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact*/.recentEngagements()
                throw r0
            Le:
                r0 = r4
                com.amazonaws.amplify.generated.graphql.DeleteEntityListMembershipMutation.Contact.recentEngagementsUpdatedAt()
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.addedById():java.lang.String");
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Throwable;>(Ljava/lang/Throwable;)V^TT; */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        private static String m16277b(CreateAccountSubscriptionBillCycleInput createAccountSubscriptionBillCycleInput) throws Throwable {
            throw createAccountSubscriptionBillCycleInput;
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:565)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v6 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:565)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v6 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:565)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Incorrect return type in method signature: ([Ljava/lang/Class<*>;[Ljava/lang/String;)Z */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('types' java.lang.Class[])]) (LINE:149), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0002: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('typeNames' java.lang.String[])]), block:B:2:0x0000 */
        private static type.CreateAccountSubscriptionBillCycleInput.Builder builder() {
            /*
                r0 = r4
                int r0 = r0.length
                r1 = r5
                int r1 = r1.length
                if (r0 == r1) goto L9
                r0 = 0
                return r0
            L9:
                r0 = 0
                r6 = r0
                goto L22
            Le:
                r0 = r4
                r1 = r6
                r0 = r0[r1]
                java.lang.String r0 = r0.lastRepeatEnquiryDate()
                r1 = r5
                r2 = r6
                r1 = r1[r2]
                java.lang.String r0 = r0.lastClosedTaskDetail()
                if (r0 != 0) goto L1f
                r0 = 0
                return r0
            L1f:
                int r6 = r6 + 1
            L22:
                r0 = r6
                r1 = r4
                int r1 = r1.length
                if (r0 < r1) goto Le
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Util.builder():type.CreateAccountSubscriptionBillCycleInput$Builder");
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$LombokDeps.SCL.lombok */
    public static final class LombokDeps {
        public static final Method ADD_LOMBOK_NOTES = null;
        public static final Method POST_COMPILER_BYTES_STRING = null;
        public static final Method POST_COMPILER_OUTPUTSTREAM = null;
        public static final Method POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING = null;

        /* JADX WARN: Multi-variable type inference failed */
        public LombokDeps() {
            super/*android.os.BaseBundle*/.getString(this);
            return;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.content.pm.PackageManager, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$Editor, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences$Editor, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences$Editor, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences$Editor, java.lang.reflect.Method] */
        static String openVideoCallDetail() {
            ?? packageManager = Context.getPackageManager();
            Class[] clsArr = {String.class, String.class};
            ADD_LOMBOK_NOTES = SharedPreferences.Editor.putBoolean(packageManager, "addLombokNotesToEclipseAboutDialog");
            Class[] clsArr2 = {byte[].class, String.class};
            POST_COMPILER_BYTES_STRING = SharedPreferences.Editor.putBoolean(packageManager, "runPostCompiler");
            new Class[1][0] = OutputStream.class;
            POST_COMPILER_OUTPUTSTREAM = SharedPreferences.Editor.putBoolean(packageManager, "runPostCompiler");
            Class[] clsArr3 = {BufferedOutputStream.class, String.class, String.class};
            POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING = SharedPreferences.Editor.putBoolean(packageManager, "runPostCompiler");
            return;
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r6v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r6v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('origReturnValue' java.lang.String)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0017: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('origReturnValue' java.lang.String)]) (LINE:176), block:B:4:0x0016 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('key' java.lang.String)]), block:B:2:0x0000 */
        public static java.lang.String paymentRequestDetail() {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.ADD_LOMBOK_NOTES     // Catch: java.lang.Throwable -> L16
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                android.os.Bundle r0 = android.os.Bundle.getBundle(r0)     // Catch: java.lang.Throwable -> L16
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.LombokDeps.paymentRequestDetail():java.lang.String");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('bytes' byte[])]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('fileName' java.lang.String)]), block:B:2:0x0000 */
        public static java.util.List preferredContactDays() {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BYTES_STRING
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                android.os.Bundle r0 = android.os.Bundle.getBundle(r0)
                byte[] r0 = (byte[]) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.LombokDeps.preferredContactDays():java.util.List");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('out' java.io.OutputStream)]), block:B:2:0x0000 */
        public static java.lang.String primaryTeamId() throws java.io.IOException {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_OUTPUTSTREAM
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                android.os.Bundle r0 = android.os.Bundle.getBundle(r0)
                java.io.OutputStream r0 = (java.io.OutputStream) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.LombokDeps.primaryTeamId():java.lang.String");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('out' java.io.BufferedOutputStream)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('path' java.lang.String)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('name' java.lang.String)]), block:B:2:0x0000 */
        public static java.util.List productService() throws java.io.IOException {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                android.os.Bundle r0 = android.os.Bundle.getBundle(r0)
                java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.LombokDeps.productService():java.util.List");
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$Transform.SCL.lombok */
    public static final class Transform {
        private static Method TRANSFORM;
        private static Method TRANSFORM_SWAPPED;

        /* JADX WARN: Multi-variable type inference failed */
        public Transform() {
            super/*android.animation.AnimatorSet*/.playTogether(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.app.FragmentManager, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.app.FragmentManager, java.lang.reflect.Method] */
        public static synchronized void init(ClassLoader prepend) {
            if (TRANSFORM != null) {
                return;
            }
            ValueAnimator.cancel();
            ValueAnimator.setInterpolator("lombok.eclipse.TransformEclipseAST");
            TRANSFORM = Activity.getFragmentManager();
            TRANSFORM_SWAPPED = Activity.getFragmentManager();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, void] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.ClassLoader, void] */
        public static void transform(Object obj, Object ast) throws IOException {
            init(obj.setFinishOnTouchOutside(obj).startActivity(obj));
            Util.invokeMethod(TRANSFORM, new Object[]{obj, ast});
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, void] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.ClassLoader, void] */
        public static void transform_swapped(Object ast, Object obj) throws IOException {
            init(obj.setFinishOnTouchOutside(obj).startActivity(obj));
            Util.invokeMethod(TRANSFORM_SWAPPED, new Object[]{ast, obj});
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$Delegate.SCL.lombok */
    public static final class Delegate {
        private static final Method HANDLE_DELEGATE_FOR_TYPE = null;
        private static final Method ADD_GENERATED_DELEGATE_METHODS = null;

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        public Delegate(com.amplifyframework.datastore.generated.model.ProductService r3) {
            /*
                r2 = this;
                r0 = r2
                super/*ai.salesmax.MainActivity.c0*/.invoke(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Delegate.ar(com.amplifyframework.datastore.generated.model.ProductService):o.x6c");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
              (r0v1 ?? I:ai.salesmax.MainActivity A[D('shadowed' java.lang.Class<?>)]) from 0x0029: INVOKE (r0v5 ?? I:void) = (r0v1 ?? I:ai.salesmax.MainActivity A[D('shadowed' java.lang.Class<?>)]) STATIC call: ai.salesmax.MainActivity.a0.<init>(ai.salesmax.MainActivity):void A[MD:(ai.salesmax.MainActivity):void (m)] (LINE:225)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static boolean Zw(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
              (r0v1 ?? I:ai.salesmax.MainActivity A[D('shadowed' java.lang.Class<?>)]) from 0x0029: INVOKE (r0v5 ?? I:void) = (r0v1 ?? I:ai.salesmax.MainActivity A[D('shadowed' java.lang.Class<?>)]) STATIC call: ai.salesmax.MainActivity.a0.<init>(ai.salesmax.MainActivity):void A[MD:(ai.salesmax.MainActivity):void (m)] (LINE:225)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        public static p001o.s47 ax(
        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('javaElement' java.lang.Object)]), block:B:2:0x0000 */
        public static p001o.x6c br(com.amplifyframework.datastore.generated.model.ProductService r6) {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Delegate.ADD_GENERATED_DELEGATE_METHODS
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                void r0 = ai.salesmax.MainActivity.C0005c.mo25b(r0)
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Delegate.br(com.amplifyframework.datastore.generated.model.ProductService):o.x6c");
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$ValPortal.SCL.lombok */
    public static final class ValPortal {
        private static final Method COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE;
        private static final Method COPY_INITIALIZATION_OF_LOCAL_DECLARATION;
        private static final Method ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT;
        private static final Method ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION;

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 4, list:
              (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) from 0x0012: INVOKE (r0v3 ?? I:j$.time.DayOfWeek) = (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) STATIC call: j$.time.DayOfWeek.plus(long):j$.time.DayOfWeek A[MD:(long):j$.time.DayOfWeek (m)] (LINE:246)
              (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) from 0x0024: INVOKE (r0v5 ?? I:j$.time.DayOfWeek) = (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) STATIC call: j$.time.DayOfWeek.plus(long):j$.time.DayOfWeek A[MD:(long):j$.time.DayOfWeek (m)] (LINE:247)
              (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) from 0x0040: INVOKE (r0v7 ?? I:j$.time.DayOfWeek) = (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) STATIC call: j$.time.DayOfWeek.plus(long):j$.time.DayOfWeek A[MD:(long):j$.time.DayOfWeek (m)] (LINE:248)
              (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) from 0x005c: INVOKE (r0v9 ?? I:j$.time.DayOfWeek) = (r0v1 ?? I:long A[D('shadowed' java.lang.Class<?>)]) STATIC call: j$.time.DayOfWeek.plus(long):j$.time.DayOfWeek A[MD:(long):j$.time.DayOfWeek (m)] (LINE:249)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                java.lang.String r0 = "lombok.eclipse.agent.PatchValEclipsePortal"
                void r0 = j$.time.DateTimeException.<init>(r0, r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "copyInitializationOfForEachIterable"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                j$.time.DayOfWeek r0 = j$.time.DayOfWeek.plus(r0)
                lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE = r0
                r0 = r7
                java.lang.String r1 = "copyInitializationOfLocalDeclaration"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                j$.time.DayOfWeek r0 = j$.time.DayOfWeek.plus(r0)
                lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_LOCAL_DECLARATION = r0
                r0 = r7
                java.lang.String r1 = "addFinalAndValAnnotationToVariableDeclarationStatement"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                j$.time.DayOfWeek r0 = j$.time.DayOfWeek.plus(r0)
                lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT = r0
                r0 = r7
                java.lang.String r1 = "addFinalAndValAnnotationToSingleVariableDeclaration"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                j$.time.DayOfWeek r0 = j$.time.DayOfWeek.plus(r0)
                lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ValPortal.m68968clinit():void");
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.reflect.Method] */
        public static void copyInitializationOfForEachIterable(Object parser) {
            ?? r0 = COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE;
            new Object[1][0] = parser;
            Instant.adjustInto(r0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.reflect.Method] */
        public static void copyInitializationOfLocalDeclaration(Object parser) {
            ?? r0 = COPY_INITIALIZATION_OF_LOCAL_DECLARATION;
            new Object[1][0] = parser;
            Instant.adjustInto(r0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.reflect.Method] */
        public static void addFinalAndValAnnotationToVariableDeclarationStatement(Object converter, Object out, Object in) {
            Object[] objArr = {converter, out, in};
            Instant.adjustInto(ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.Temporal, java.lang.reflect.Method] */
        public static void addFinalAndValAnnotationToSingleVariableDeclaration(Object converter, Object out, Object in) {
            Object[] objArr = {converter, out, in};
            Instant.adjustInto(ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION);
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$Val.SCL.lombok */
    public static final class Val {
        private static final String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final String LOCAL_DECLARATION_SIG = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration";
        private static final String FOREACH_STATEMENT_SIG = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement";
        private static final Method HANDLE_VAL_FOR_LOCAL_DECLARATION;
        private static final Method HANDLE_VAL_FOR_FOR_EACH;

        /* JADX WARN: Multi-variable type inference failed */
        public Val() {
            super();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String, java.lang.reflect.Method] */
        static {
            GetWabaWebhookEventQuery.GetWabaWebhookEvent.createdAt();
            String[] strArr = {LOCAL_DECLARATION_SIG, BLOCK_SCOPE_SIG};
            HANDLE_VAL_FOR_LOCAL_DECLARATION = GetWabaWebhookEventQuery.GetWabaWebhookEvent.updatedAt();
            String[] strArr2 = {FOREACH_STATEMENT_SIG, BLOCK_SCOPE_SIG};
            HANDLE_VAL_FOR_FOR_EACH = GetWabaWebhookEventQuery.GetWabaWebhookEvent.updatedAt();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.apollographql.apollo.api.ResponseReader, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.amazonaws.amplify.generated.graphql.GetWebInitiatedCallQuery$Data, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, com.apollographql.apollo.api.ResponseFieldMarshaller] */
        public static boolean handleValForLocalDeclaration(Object local, Object scope) {
            Object[] objArr = {local, scope};
            return ((Boolean) GetWebInitiatedCallQuery.Data.Mapper.map((ResponseReader) HANDLE_VAL_FOR_LOCAL_DECLARATION)).marshaller();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.apollographql.apollo.api.ResponseReader, java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.amazonaws.amplify.generated.graphql.GetWebInitiatedCallQuery$Data, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, com.apollographql.apollo.api.ResponseFieldMarshaller] */
        public static boolean handleValForForEach(Object forEach, Object scope) {
            Object[] objArr = {forEach, scope};
            return ((Boolean) GetWebInitiatedCallQuery.Data.Mapper.map((ResponseReader) HANDLE_VAL_FOR_FOR_EACH)).marshaller();
        }

        public static TypeBinding skipResolveInitializerIfAlreadyCalled(Expression expr, BlockScope scope) {
            if (expr.resolvedType != null) {
                return expr.resolvedType;
            }
            try {
                return expr.status();
            } catch (ArrayIndexOutOfBoundsException unused) {
                return null;
            } catch (NullPointerException unused2) {
                return null;
            }
        }

        public static TypeBinding skipResolveInitializerIfAlreadyCalled2(Expression expr, BlockScope scope, LocalDeclaration decl) {
            if (decl != null) {
                decl.name();
                if (LocalDeclaration.class.variables() != null && expr.resolvedType != null) {
                    return expr.resolvedType;
                }
            }
            try {
                return expr.status();
            } catch (ArrayIndexOutOfBoundsException unused) {
                return null;
            } catch (NullPointerException unused2) {
                return null;
            }
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$ExtensionMethod.SCL.lombok */
    public static final class ExtensionMethod {
        private static final String MESSAGE_SEND_SIG = "org.eclipse.jdt.internal.compiler.ast.MessageSend";
        private static final String TYPE_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding";
        private static final String SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.Scope";
        private static final String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final String TYPE_BINDINGS_SIG = "[Lorg.eclipse.jdt.internal.compiler.lookup.TypeBinding;";
        private static final String PROBLEM_REPORTER_SIG = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter";
        private static final String METHOD_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding";
        private static final String AST_NODE_SIG = "org.eclipse.jdt.internal.compiler.ast.ASTNode";
        private static final Method RESOLVE_TYPE = null;
        private static final Method ERROR_NO_METHOD_FOR = null;
        private static final Method INVALID_METHOD = null;
        private static final Method INVALID_METHOD2 = null;
        private static final Method NON_STATIC_ACCESS_TO_STATIC_METHOD = null;

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        public ExtensionMethod(java.lang.Object r3) {
            /*
                r2 = this;
                r0 = r2
                r0.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ExtensionMethod.setValue(java.lang.Object):void");
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ai.salesmax.model.PaginatedDataModel, java.lang.Class] */
        /* renamed from: m */
        static void mo36295m(float f) {
            ?? contactIds = AutoCallConfig.getContactIds();
            RESOLVE_TYPE = Util.findMethod(contactIds, "resolveType", new String[]{TYPE_BINDING_SIG, MESSAGE_SEND_SIG, BLOCK_SCOPE_SIG});
            ERROR_NO_METHOD_FOR = Util.findMethod(contactIds, "errorNoMethodFor", new String[]{PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, TYPE_BINDING_SIG, TYPE_BINDINGS_SIG});
            INVALID_METHOD = Util.findMethod(contactIds, "invalidMethod", new String[]{PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, METHOD_BINDING_SIG});
            INVALID_METHOD2 = Util.findMethod(contactIds, "invalidMethod", new String[]{PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, METHOD_BINDING_SIG, SCOPE_SIG});
            NON_STATIC_ACCESS_TO_STATIC_METHOD = Util.findMethod(contactIds, "nonStaticAccessToStaticMethod", new String[]{PROBLEM_REPORTER_SIG, AST_NODE_SIG, METHOD_BINDING_SIG, MESSAGE_SEND_SIG});
        }

        public static Object resolveType(Object resolvedType, Object methodCall, Object scope) {
            return Util.invokeMethod(RESOLVE_TYPE, new Object[]{resolvedType, methodCall, scope});
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('problemReporter' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('recType' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('params' java.lang.Object)]), block:B:2:0x0000 */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68946init() {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.ERROR_NO_METHOD_FOR
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ExtensionMethod.m68946init():void");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' java.lang.Object)]), block:B:2:0x0000 */
        public static void onDismiss(android.content.DialogInterface r6) {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ExtensionMethod.onDismiss(android.content.DialogInterface):void");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('scope' java.lang.Object)]), block:B:2:0x0000 */
        /* renamed from: a */
        public static android.os.Handler m16274a(android.os.Looper r6) {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD2
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ExtensionMethod.m16274a(android.os.Looper):android.os.Handler");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' java.lang.Object)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' java.lang.Object)]), block:B:2:0x0000 */
        /* renamed from: a */
        public static java.lang.Thread m16275a(java.lang.String r6, java.lang.Runnable r7) {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.NON_STATIC_ACCESS_TO_STATIC_METHOD
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.ExtensionMethod.m16275a(java.lang.String, java.lang.Runnable):java.lang.Thread");
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$Javadoc.SCL.lombok */
    public static final class Javadoc {
        private static final Method GET_HTML = null;
        private static final Method PRINT_METHOD = null;

        /* JADX WARN: Multi-variable type inference failed */
        public Javadoc() {
            super/*android.animation.FloatEvaluator*/.evaluate(this, this, this);
            return;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class, void] */
        static long getNumBytesUploaded() {
            ?? AddListener = Animator.addListener("lombok.eclipse.agent.PatchJavadoc");
            GET_HTML = Util.findMethod(AddListener, "getHTMLContentFromSource", new Class[]{String.class, Object.class});
            PRINT_METHOD = Util.findMethod(AddListener, "printMethod", new Class[]{AbstractMethodDeclaration.class, Integer.class, StringBuffer.class, TypeDeclaration.class});
            return;
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('original' java.lang.String)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('member' org.eclipse.jdt.core.IJavaElement)]), block:B:2:0x0000 */
        public static com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener getProgressListener() {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Javadoc.GET_HTML
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r0, r1, r3, r0)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Javadoc.getProgressListener():com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener");
        }

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('methodDeclaration' org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration)])
        , block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('tab' int)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0014: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('output' java.lang.StringBuffer)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0018: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('type' org.eclipse.jdt.internal.compiler.ast.TypeDeclaration)])
        , block:B:2:0x0000 */
        public static com.google.api.client.util.Sleeper getSleeper() {
            /*
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Javadoc.PRINT_METHOD
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                void r4 = android.animation.StateListAnimator.<init>()
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r0, r1, r3, r0)
                java.lang.StringBuffer r0 = (java.lang.StringBuffer) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.Javadoc.getSleeper():com.google.api.client.util.Sleeper");
        }
    }

    /* loaded from: salesmax.apk:Class50/lombok/launch/PatchFixesHider$PatchFixes.SCL.lombok */
    public static final class PatchFixes {
        public static final int ALREADY_PROCESSED_FLAG = 8388608;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0002: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('node' org.eclipse.jdt.core.dom.ASTNode)]) A[TRY_ENTER] (LINE:397), block:B:3:0x0002 */
        /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.ObjectAnimator] */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.animation.Animator, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r0v5, types: [void] */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.animation.Animator$AnimatorListener, android.animation.PropertyValuesHolder[], java.lang.Object, org.eclipse.jdt.core.dom.ASTNode] */
        /* renamed from: build */
        public static AWSFaceLivenessSessionOptions m68959build() {
            ?? r3;
            AWSFaceLivenessSessionOptions aWSFaceLivenessSessionOptionsOfPropertyValuesHolder = null;
            try {
                aWSFaceLivenessSessionOptionsOfPropertyValuesHolder = ((Boolean) r3.getClass().getField("$isGenerated").addListener(r3)).booleanValue() ? 1 : 0;
                if (aWSFaceLivenessSessionOptionsOfPropertyValuesHolder == null && r3.getParent() != null && (r3.getParent() instanceof QualifiedName)) {
                    aWSFaceLivenessSessionOptionsOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(r3.getParent(), r3);
                }
            } catch (Exception unused) {
            }
            return aWSFaceLivenessSessionOptionsOfPropertyValuesHolder;
        }

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0002: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('node' org.eclipse.jdt.internal.compiler.ast.ASTNode)])
         A[TRY_ENTER] (LINE:410), block:B:3:0x0002 */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.animation.Animator, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r0v5, types: [void] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r3v0, names: [node], types: [android.animation.Animator$AnimatorListener, java.lang.Object, org.eclipse.jdt.internal.compiler.ast.ASTNode] */
        /* renamed from: build, reason: collision with other method in class */
        public static FaceLivenessSessionOptions m68959build() {
            ?? r3;
            FaceLivenessSessionOptions faceLivenessSessionOptions = null;
            try {
                faceLivenessSessionOptions = r3.getClass().getField("$generatedBy").addListener(r3) != 0 ? 1 : 0;
            } catch (Exception unused) {
            }
            return faceLivenessSessionOptions;
        }

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('visitor' org.eclipse.jdt.core.dom.ASTVisitor)]) (LINE:418), block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v3, names: [className], types: [android.app.Activity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v7, types: [void] */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.animation.ObjectAnimator, com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions$Builder] */
        /* JADX WARN: Type inference failed for: r3v0, names: [node], types: [android.animation.PropertyValuesHolder[], com.amplifyframework.auth.AWSCredentialsProvider, java.lang.Object, org.eclipse.jdt.core.dom.ASTNode] */
        /* JADX WARN: Type inference failed for: r4v0, names: [visitor], types: [java.lang.Object, org.eclipse.jdt.core.dom.ASTVisitor] */
        public static AWSFaceLivenessSessionOptions.Builder credentialsProvider(AWSCredentialsProvider aWSCredentialsProvider) {
            ?? r4;
            if (r4 == 0) {
                return null;
            }
            ?? name = r4.getClass().getName();
            if (!(name.getCallingActivity() == null && name.getCallingActivity() == null && name.getCallingActivity() == null) && name.onDestroy() == 0) {
                return ObjectAnimator.ofPropertyValuesHolder(aWSCredentialsProvider, aWSCredentialsProvider);
            }
            return null;
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('rewrite' org.eclipse.jdt.core.dom.rewrite.ListRewrite)])
         (LINE:428), block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, void] */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.animation.ObjectAnimator, com.amplifyframework.auth.AWSCredentialsProvider] */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.animation.PropertyValuesHolder[], android.app.Activity, android.content.Intent, int] */
        public static AWSCredentialsProvider getCredentialsProvider() {
            ?? r2;
            return ObjectAnimator.ofPropertyValuesHolder(r2.setResult(r2, r2), r2);
        }

        /* renamed from: getThis */
        public static AWSFaceLivenessSessionOptions.Builder m68960getThis() {
            return null;
        }

        /* renamed from: getThis, reason: collision with other method in class */
        public static FaceLivenessSessionOptions.Builder m68960getThis() {
            return 1;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 4, list:
              (r0v3 ?? I:android.os.Bundle) from 0x0032: INVOKE (r0v5 ?? I:void) = (r0v3 ?? I:android.app.Dialog), (r0v3 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[Catch: Exception -> 0x003c, MD:(android.os.Bundle):void (c)] (LINE:442)
              (r0v3 ?? I:android.app.Dialog) from 0x0032: INVOKE (r0v5 ?? I:void) = (r0v3 ?? I:android.app.Dialog), (r0v3 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[Catch: Exception -> 0x003c, MD:(android.os.Bundle):void (c)] (LINE:442)
              (r0v3 ?? I:android.content.Context) from CONSTRUCTOR (r0v3 ?? I:android.content.Context), (r0v3 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
              (r0v3 ?? I:int) from CONSTRUCTOR (r0v3 ?? I:android.content.Context), (r0v3 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0004: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('list' java.util.List)]), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x003d: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('list' java.util.List)]) (LINE:450), block:B:10:0x003c */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68947init() {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3c
                r1 = r0
                r2 = r4
                android.app.AlertDialog r2 = r2.create()     // Catch: java.lang.Exception -> L3c
                super/*android.app.AlertDialog.Builder*/.setPositiveButton(r2, r0)     // Catch: java.lang.Exception -> L3c
                r5 = r0
                r0 = r4
                void r0 = r0.checkPackage(r4, r0)     // Catch: java.lang.Exception -> L3c
                r7 = r0
                goto L31
            L18:
                r0 = r7
                void r0 = r0.<init>(r7, r0)     // Catch: java.lang.Exception -> L3c
                r6 = r0
                r0 = r6
                org.eclipse.jdt.core.dom.ASTNode r0 = (org.eclipse.jdt.core.dom.ASTNode) r0     // Catch: java.lang.Exception -> L3c
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r0)     // Catch: java.lang.Exception -> L3c
                if (r0 != 0) goto L31
                r0 = r5
                r1 = r6
                boolean r0 = r0.isShowing()     // Catch: java.lang.Exception -> L3c
            L31:
                r0 = r7
                void r0 = r0.onCreate(r7)     // Catch: java.lang.Exception -> L3c
                if (r0 != 0) goto L18
                r0 = r5
                return r0
            L3c:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68947init():void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 4, list:
              (r0v5 ?? I:android.os.Bundle) from 0x0062: INVOKE (r0v7 ?? I:void) = (r0v5 ?? I:android.app.Dialog), (r0v5 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:457)
              (r0v5 ?? I:android.app.Dialog) from 0x0062: INVOKE (r0v7 ?? I:void) = (r0v5 ?? I:android.app.Dialog), (r0v5 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:457)
              (r0v5 ?? I:android.content.Context) from CONSTRUCTOR (r0v5 ?? I:android.content.Context), (r0v5 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
              (r0v5 ?? I:int) from CONSTRUCTOR (r0v5 ?? I:android.content.Context), (r0v5 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('processor' java.lang.Object)]) (LINE:468), block:B:16:0x006a */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('declaration' org.eclipse.jdt.core.dom.MethodDeclaration)])
         (LINE:454), block:B:2:0x0000 */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68948init(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 4, list:
              (r0v5 ?? I:android.os.Bundle) from 0x0062: INVOKE (r0v7 ?? I:void) = (r0v5 ?? I:android.app.Dialog), (r0v5 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:457)
              (r0v5 ?? I:android.app.Dialog) from 0x0062: INVOKE (r0v7 ?? I:void) = (r0v5 ?? I:android.app.Dialog), (r0v5 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:457)
              (r0v5 ?? I:android.content.Context) from CONSTRUCTOR (r0v5 ?? I:android.content.Context), (r0v5 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
              (r0v5 ?? I:int) from CONSTRUCTOR (r0v5 ?? I:android.content.Context), (r0v5 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 4, list:
              (r0v1 ?? I:android.os.Bundle) from 0x00f2: INVOKE (r0v3 ?? I:void) = (r0v1 ?? I:android.app.Dialog), (r0v1 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:505)
              (r0v1 ?? I:android.app.Dialog) from 0x00f2: INVOKE (r0v3 ?? I:void) = (r0v1 ?? I:android.app.Dialog), (r0v1 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:505)
              (r0v1 ?? I:android.content.Context) from CONSTRUCTOR (r0v1 ?? I:android.content.Context), (r0v1 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
              (r0v1 ?? I:int) from CONSTRUCTOR (r0v1 ?? I:android.content.Context), (r0v1 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<Lorg/eclipse/jdt/core/dom/Annotation;>;Ljava/lang/StringBuilder;)V */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('annotations' java.util.List<org.eclipse.jdt.core.dom.Annotation>)])
         (LINE:505), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('signature' java.lang.StringBuilder)]) (LINE:515), block:B:12:0x0079 */
        public static com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions.Builder builder() {
            /*
                r0 = r3
                void r0 = r0.checkPackage(r3, r0)
                r6 = r0
                goto Lf1
            La:
                r0 = r6
                void r0 = r0.<init>(r6, r0)
                org.eclipse.jdt.core.dom.Annotation r0 = (org.eclipse.jdt.core.dom.Annotation) r0
                r5 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                super/*android.app.Dialog*/.setDismissMessage(r0)
                r7 = r0
                r0 = r5
                void r0 = r0.jobFinished(r5, r0)
                if (r0 == 0) goto L3d
                r0 = r5
                org.eclipse.jdt.core.dom.SingleMemberAnnotation r0 = (org.eclipse.jdt.core.dom.SingleMemberAnnotation) r0
                r8 = r0
                r0 = r7
                r1 = r8
                boolean r1 = r1.isOrderedBroadcast()
                void r1 = r1.<init>(r8, r0)
                boolean r0 = r0.isShowing()
                goto L79
            L3d:
                r0 = r5
                java.lang.String r0 = r0.getPackageName()
                if (r0 == 0) goto L79
                r0 = r5
                org.eclipse.jdt.core.dom.NormalAnnotation r0 = (org.eclipse.jdt.core.dom.NormalAnnotation) r0
                r8 = r0
                r0 = r8
                java.io.InputStream r0 = r0.openInputStream(r8)
                void r0 = r0.checkPackage(r8, r0)
                r10 = r0
                goto L6f
            L59:
                r0 = r10
                void r0 = r0.<init>(r10, r0)
                r9 = r0
                r0 = r7
                r1 = r9
                void r1 = r1.<init>()
                boolean r0 = r0.isShowing()
            L6f:
                r0 = r10
                void r0 = r0.onCreate(r10)
                if (r0 != 0) goto L59
            L79:
                r0 = r4
                java.lang.String r1 = "@"
                void r0 = r0.onStop()
                r1 = r5
                org.eclipse.jdt.core.dom.ITypeBinding r1 = r1.resolveTypeBinding()
                android.app.Fragment r1 = r1.getParentFragment()
                void r0 = r0.onStop()
                r0 = r7
                void r0 = r0.put(r7, r0)
                if (r0 != 0) goto Lea
                r0 = r4
                java.lang.String r1 = "("
                void r0 = r0.onStop()
                r0 = 1
                r8 = r0
                r0 = r7
                void r0 = r0.checkPackage(r7, r0)
                r10 = r0
                goto Ld8
            Lac:
                r0 = r10
                void r0 = r0.<init>(r10, r0)
                java.lang.String r0 = (java.lang.String) r0
                r9 = r0
                r0 = r8
                if (r0 != 0) goto Lc4
                r0 = r4
                java.lang.String r1 = ", "
                void r0 = r0.onStop()
            Lc4:
                r0 = 0
                r8 = r0
                r0 = r4
                r1 = 34
                void r0 = r0.putAll(r1)
                r1 = r9
                void r0 = r0.onStop()
                r1 = 34
                void r0 = r0.putAll(r1)
            Ld8:
                r0 = r10
                void r0 = r0.onCreate(r10)
                if (r0 != 0) goto Lac
                r0 = r4
                java.lang.String r1 = ")"
                void r0 = r0.onStop()
            Lea:
                r0 = r4
                java.lang.String r1 = " "
                void r0 = r0.onStop()
            Lf1:
                r0 = r6
                void r0 = r0.onCreate(r6)
                if (r0 != 0) goto La
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.builder():com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions$Builder");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 ??, still in use, count: 1, list:
              (r0v16 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0061: IF  (r0v16 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:30:0x0069
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('sourceMethod' org.eclipse.jdt.core.IMethod)]) (LINE:531), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0001: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('cuUnit' org.eclipse.jdt.core.dom.CompilationUnit)])
        , block:B:2:0x0000 */
        public static com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions defaults() throws org.eclipse.jdt.core.JavaModelException {
            /*
                r0 = r3
                r1 = r4
                android.content.ContentResolver r0 = android.content.Context.getContentResolver()
                r5 = r0
                r0 = r5
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r5)
                if (r0 == 0) goto Lc2
                r0 = r3
                java.io.File r0 = r0.getNoBackupFilesDir()
                r6 = r0
                java.util.Stack r0 = new java.util.Stack
                r1 = r0
                super/*android.content.Context*/.getSystemService(r0)
                r7 = r0
                goto L2e
            L20:
                r0 = r7
                r1 = r6
                android.content.res.Resources$Theme r0 = r0.getTheme()
                r0 = r6
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r6)
                r6 = r0
            L2e:
                r0 = r6
                if (r0 != 0) goto L20
                r0 = r7
                void r0 = r0.registerComponentCallbacks(r7)
                org.eclipse.jdt.core.IType r0 = (org.eclipse.jdt.core.IType) r0
                r8 = r0
                r0 = r8
                r1 = r4
                void r1 = r1.sendOrderedBroadcast(r4, r0)
                void r0 = android.content.Context.unregisterReceiver(r0)
                r9 = r0
                goto L5c
            L4a:
                r0 = r7
                void r0 = r0.registerComponentCallbacks(r7)
                org.eclipse.jdt.core.IType r0 = (org.eclipse.jdt.core.IType) r0
                r1 = r9
                void r1 = r1.dismiss()
                void r0 = android.content.Context.unregisterReceiver(r0)
                r9 = r0
            L5c:
                r0 = r7
                void r0 = r0.<init>(r7, r0)
                if (r0 != 0) goto L69
                r0 = r9
                if (r0 != 0) goto L4a
            L69:
                r0 = r7
                void r0 = r0.<init>(r7, r0)
                if (r0 == 0) goto Lc2
                r0 = r9
                if (r0 == 0) goto Lc2
                r0 = r3
                java.lang.String r0 = r0.getElementName()
                r10 = r0
                r0 = r9
                void r0 = r0.dismiss()
                void r0 = r0.checkPackage(r9, r0)
                r12 = r0
                goto Lb8
            L8d:
                r0 = r12
                void r0 = r0.<init>(r12, r0)
                r11 = r0
                r0 = r11
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.MethodDeclaration
                if (r0 == 0) goto Lb8
                r0 = r11
                org.eclipse.jdt.core.dom.MethodDeclaration r0 = (org.eclipse.jdt.core.dom.MethodDeclaration) r0
                r13 = r0
                r0 = r13
                void r0 = r0.cancel(r13)
                boolean r0 = r0.getBooleanExtra(r13, r0)
                r1 = r10
                void r0 = r0.onDestroy()
                if (r0 == 0) goto Lb8
                r0 = r13
                return r0
            Lb8:
                r0 = r12
                void r0 = r0.onCreate(r12)
                if (r0 != 0) goto L8d
            Lc2:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.defaults():com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 4, list:
              (r0v1 ?? I:android.os.Bundle) from 0x0036: INVOKE (r0v3 ?? I:void) = (r0v1 ?? I:android.app.Dialog), (r0v1 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:563)
              (r0v1 ?? I:android.app.Dialog) from 0x0036: INVOKE (r0v3 ?? I:void) = (r0v1 ?? I:android.app.Dialog), (r0v1 ?? I:android.os.Bundle) INTERFACE call: android.app.Dialog.onCreate(android.os.Bundle):void A[MD:(android.os.Bundle):void (c)] (LINE:563)
              (r0v1 ?? I:android.content.Context) from CONSTRUCTOR (r0v1 ?? I:android.content.Context), (r0v1 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
              (r0v1 ?? I:int) from CONSTRUCTOR (r0v1 ?? I:android.content.Context), (r0v1 ?? I:int) call: android.app.Dialog.<init>(android.content.Context, int):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Incorrect return type in method signature: (Lorg/eclipse/jdt/core/IType;Ljava/util/List<*>;)Lorg/eclipse/jdt/core/dom/AbstractTypeDeclaration; */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0026: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('searchType' org.eclipse.jdt.core.IType)]), block:B:5:0x0018 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('nodes' java.util.List<?>)]) (LINE:563), block:B:2:0x0000 */
        static {
            /*
                r0 = r4
                void r0 = r0.checkPackage(r4, r0)
                r6 = r0
                goto L35
            La:
                r0 = r6
                void r0 = r0.<init>(r6, r0)
                r5 = r0
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.AbstractTypeDeclaration
                if (r0 == 0) goto L35
                r0 = r5
                org.eclipse.jdt.core.dom.AbstractTypeDeclaration r0 = (org.eclipse.jdt.core.dom.AbstractTypeDeclaration) r0
                r7 = r0
                r0 = r7
                android.content.Intent r0 = r0.putExtra(r7, r0)
                boolean r0 = r0.getBooleanExtra(r7, r0)
                r1 = r3
                android.content.Intent r1 = r1.putExtra(r3, r0)
                void r0 = r0.onDestroy()
                if (r0 == 0) goto L35
                r0 = r7
                return r0
            L35:
                r0 = r6
                void r0 = r0.onCreate(r6)
                if (r0 != 0) goto La
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68949clinit():void");
        }

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('node' org.eclipse.jdt.internal.compiler.ast.ASTNode)])
         (LINE:575), block:B:4:0x0005 */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.animation.Animator, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r0v5, types: [void] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int, void] */
        /* JADX WARN: Type inference failed for: r3v0, names: [sourceEnd], types: [com.amplifyframework.auth.AWSCredentialsProvider, int, void] */
        /* JADX WARN: Type inference failed for: r4v0, names: [node], types: [android.animation.Animator$AnimatorListener, java.lang.Object, org.eclipse.jdt.internal.compiler.ast.ASTNode] */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68950init(AWSCredentialsProvider aWSCredentialsProvider) throws Exception {
            ?? r4;
            if (aWSCredentialsProvider == -1 && (r0 = (ASTNode) r4.getClass().getField("$generatedBy").addListener(r4)) != null) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68951init(AWSCredentialsProvider aWSCredentialsProvider, id5 id5Var) {
            if (aWSCredentialsProvider == -1) {
            }
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('original' int)]) (LINE:588), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0008: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('start' int)]), block:B:6:0x0007 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('end' int)]), block:B:4:0x0005 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x000c: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('end' int)]), block:B:8:0x000c */
        /* renamed from: builder, reason: collision with other method in class */
        public static com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions.Builder m68961builder() {
            /*
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L7
                r0 = r5
                return r0
            L7:
                r0 = r3
                r1 = r4
                if (r0 >= r1) goto Le
                r0 = r5
                return r0
            Le:
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68961builder():com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions$Builder");
        }

        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('original' int)]) (LINE:594), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('end' int)]), block:B:4:0x0005 */
        /* renamed from: defaults, reason: collision with other method in class */
        public static AWSFaceLivenessSessionOptions m68962defaults() {
            AWSFaceLivenessSessionOptions aWSFaceLivenessSessionOptions;
            AWSFaceLivenessSessionOptions aWSFaceLivenessSessionOptions2;
            return aWSFaceLivenessSessionOptions == -1 ? aWSFaceLivenessSessionOptions2 : aWSFaceLivenessSessionOptions;
        }

        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('original' int)]) (LINE:598), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('start' int)]), block:B:4:0x0005 */
        /* renamed from: getCredentialsProvider, reason: collision with other method in class */
        public static AWSCredentialsProvider m68963getCredentialsProvider() {
            AWSCredentialsProvider aWSCredentialsProvider;
            AWSCredentialsProvider aWSCredentialsProvider2;
            return aWSCredentialsProvider == -1 ? aWSCredentialsProvider2 : aWSCredentialsProvider;
        }

        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('end' int)]), block:B:4:0x0005 */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String, void] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68952init(String str) {
            if (str == -1) {
            }
        }

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('retVal' int)]) (LINE:609), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('amd' org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration)])
        , block:B:4:0x0005 */
        /* JADX WARN: Type inference failed for: r0v10, types: [int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$Editor, boolean, lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode>] */
        /* JADX WARN: Type inference failed for: r3v0, names: [retVal], types: [int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v0, names: [amd], types: [java.lang.String, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration] */
        public static String getText() {
            ?? r3;
            ?? r4;
            if (r3 != -1 || r4 == 0) {
                return r3;
            }
            ?? r0 = EcjAugments.ASTNode_generatedBy;
            if (r0.putBoolean(r4, r0) != null) {
                return ((AbstractMethodDeclaration) r4).declarationSourceEnd;
            }
            return -1;
        }

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('fd' org.eclipse.jdt.internal.compiler.ast.FieldDeclaration)])
        , block:B:4:0x0005 */
        /* JADX WARN: Type inference failed for: r0v10, types: [int, void] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$Editor, boolean, lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode>] */
        /* JADX WARN: Type inference failed for: r3v0, names: [retVal], types: [int, java.nio.ByteBuffer, void] */
        /* JADX WARN: Type inference failed for: r4v0, names: [fd], types: [java.lang.String, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration] */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68953init(ByteBuffer byteBuffer) {
            ?? r4;
            if (byteBuffer != -1 || r4 == 0) {
                return byteBuffer;
            }
            ?? r0 = EcjAugments.ASTNode_generatedBy;
            if (r0.putBoolean(r4, r0) != null) {
            }
        }

        /*  JADX ERROR: StackOverflowError in pass: ConstructorVisitor
            java.lang.StackOverflowError
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:247)
            */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('type' org.eclipse.jdt.core.dom.Type)]), block:B:4:0x0005 */
        public static com.amplifyframework.predictions.aws.request.AWSImageIdentifyRequest fromBitmap(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: StackOverflowError in pass: ConstructorVisitor
            java.lang.StackOverflowError
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            */

        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('node' java.lang.Object)]) (LINE:631), block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.animation.Animator, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r0v3, types: [void] */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.content.ComponentName, android.content.pm.PackageManager, int, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.content.pm.ServiceInfo] */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
        public static ByteBuffer getImageData() throws Exception {
            ?? r3;
            ?? r0 = (Integer) r3.getClass().getField("bits").addListener(r3);
            return (r0.getServiceInfo(r0, r0) & 8388608) != 0 ? 1 : null;
        }

        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68954init(
        /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
            java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
            	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
            	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0004: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('domNode' org.eclipse.jdt.core.dom.ASTNode)]), block:B:4:0x0004 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('internalNode' org.eclipse.jdt.internal.compiler.ast.ASTNode)])
         (LINE:642), block:B:2:0x0000 */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences$Editor, boolean, lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode>] */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.content.pm.Signature, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r4v0, names: [domNode], types: [int, java.lang.Object, org.eclipse.jdt.core.dom.ASTNode] */
        /* renamed from: getText, reason: collision with other method in class */
        public static String m68964getText() throws Exception {
            String str;
            ?? r4;
            if (str == 0 || r4 == 0) {
                return;
            }
            ?? r0 = EcjAugments.ASTNode_generatedBy;
            if (r0.putBoolean(str, r0) != null) {
                ?? field = r4.getClass().getField("$isGenerated");
                PackageManager.queryIntentServices((Intent) 1, (int) r4);
                field.equals(r4);
                return;
            }
            return;
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r1v1 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.checkCastListener(TypeUpdate.java:521)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x001e: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('name' org.eclipse.jdt.core.dom.Name)]), block:B:10:0x001e */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('internalNode' java.lang.Object)]) (LINE:648), block:B:2:0x0000 */
        public static com.amplifyframework.predictions.aws.models.AWSVoiceType getVoiceType() throws java.lang.Exception {
            /*
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ASTNode
                if (r0 == 0) goto L2f
                lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
                r1 = r5
                org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r0)
                if (r0 == 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L2f
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r4
                r2 = 1
                java.util.List r2 = android.content.pm.PackageManager.queryIntentServices(r2, r4)
                r0.equals(r1)
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.getVoiceType():com.amplifyframework.predictions.aws.models.AWSVoiceType");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 5, list:
              (r0v2 ?? I:android.os.Message) from 0x0009: INVOKE (r0v2 ?? I:android.app.Dialog), (r0v2 ?? I:android.os.Message) SUPER call: android.app.Dialog.setDismissMessage(android.os.Message):void A[MD:(android.os.Message):void (c)]
              (r0v2 ?? I:android.app.Dialog) from 0x0009: INVOKE (r0v2 ?? I:android.app.Dialog), (r0v2 ?? I:android.os.Message) SUPER call: android.app.Dialog.setDismissMessage(android.os.Message):void A[MD:(android.os.Message):void (c)]
              (r0v2 ?? I:android.app.Dialog A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)]) from 0x0082: INVOKE 
              (r0v2 ?? I:android.app.Dialog A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)])
             INTERFACE call: android.app.Dialog.isShowing():boolean A[MD:():boolean (c)] (LINE:668)
              (r0v2 ?? I:android.content.res.Resources A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)]) from 0x0094: INVOKE 
              (r0v2 ?? I:android.content.res.Resources A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)])
              (r0v3 ?? I:int A[D('modifiedChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)])
             INTERFACE call: android.content.res.Resources.getString(int):java.lang.String A[MD:(int):java.lang.String throws android.content.res.Resources$NotFoundException (c)] (LINE:673)
              (r0v2 ?? I:android.content.res.Resources A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)]) from 0x009f: INVOKE (r0v9 java.lang.Object) = 
              (r0v2 ?? I:android.content.res.Resources A[D('newChildren' java.util.List<org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent>)])
              (r1v6 ?? I:int)
             INTERFACE call: android.content.res.Resources.obtainTypedArray(int):android.content.res.TypedArray A[MD:(int):android.content.res.TypedArray throws android.content.res.Resources$NotFoundException (c)] (LINE:674)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v10, types: [org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[], void] */
        /* JADX WARN: Type inference failed for: r0v12, types: [android.content.res.Resources, int] */
        /* JADX WARN: Type inference failed for: r0v15, types: [android.animation.PropertyValuesHolder[], java.lang.Object, org.eclipse.jdt.core.dom.ASTNode] */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Dialog, android.content.res.Resources, android.os.Message, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Dialog, android.os.Message, int, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v6, types: [int, org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[]] */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68955init(java.lang.String r6, com.amplifyframework.predictions.models.LanguageType r7, com.amplifyframework.predictions.models.LanguageType r8) {
            /*
                r0 = r6
                boolean r0 = r0.isStateful()
                r7 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                super/*android.app.Dialog*/.setDismissMessage(r0)
                r8 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                super/*android.app.Dialog*/.setDismissMessage(r0)
                r9 = r0
                r0 = 0
                r10 = r0
                goto L8b
            L1b:
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                android.content.res.Configuration r0 = r0.getConfiguration()
                org.eclipse.jdt.core.dom.ASTNode r0 = (org.eclipse.jdt.core.dom.ASTNode) r0
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r0)
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L7f
                r0 = r11
                int r0 = r0.getDimensionPixelSize(r11)
                r1 = 4
                if (r0 == r1) goto L49
                r0 = r11
                int r0 = r0.getDimensionPixelSize(r11)
                r1 = 2
                if (r0 == r1) goto L49
                r0 = 0
                goto L4a
            L49:
                r0 = 1
            L4a:
                r13 = r0
                r0 = r11
                android.content.res.Configuration r0 = r0.getConfiguration()
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.MethodDeclaration
                r14 = r0
                r0 = r13
                if (r0 == 0) goto L88
                r0 = r14
                if (r0 == 0) goto L88
                r0 = r11
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r11, r1)
                if (r0 == 0) goto L88
                r0 = r9
                org.eclipse.jdt.internal.core.dom.rewrite.NodeRewriteEvent r1 = new org.eclipse.jdt.internal.core.dom.rewrite.NodeRewriteEvent
                r2 = r1
                r3 = 0
                r4 = r11
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r11, r1)
                super/*android.content.res.Resources*/.getResourcePackageName(r3)
                boolean r0 = r0.isShowing()
                goto L88
            L7f:
                r0 = r8
                r1 = r11
                boolean r0 = r0.isShowing()
            L88:
                int r10 = r10 + 1
            L8b:
                r0 = r10
                r1 = r7
                int r1 = r1.length
                if (r0 < r1) goto L1b
                r0 = r8
                r1 = r9
                java.lang.String r0 = r0.getString(r1)
                r0 = r8
                r1 = 0
                org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] r1 = new org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[r1]
                android.content.res.TypedArray r0 = r0.obtainTypedArray(r1)
                org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] r0 = (org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[]) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68955init(java.lang.String, com.amplifyframework.predictions.models.LanguageType, com.amplifyframework.predictions.models.LanguageType):void");
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r4v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r5v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r7v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0023: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('scanner' org.eclipse.jdt.internal.core.dom.rewrite.TokenScanner)])
         (LINE:685), block:B:9:0x0023 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0024: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('token' int)]), block:B:9:0x0023 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0025: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('startOffset' int)]), block:B:9:0x0023 */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0003: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('domNode' java.lang.Object)]) A[TRY_ENTER] (LINE:680), block:B:3:0x0003 */
        public static com.amplifyframework.predictions.models.LanguageType getSourceLanguage() throws org.eclipse.core.runtime.CoreException {
            /*
                r0 = 0
                r8 = r0
                r0 = r7
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L1b
                r1 = r7
                void r0 = r0.addListener(r1)     // Catch: java.lang.Exception -> L1b
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L1b
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L1b
                r8 = r0
                goto L1c
            L1b:
            L1c:
                r0 = r8
                if (r0 == 0) goto L23
                r0 = -1
                return r0
            L23:
                r0 = r4
                r1 = r5
                r2 = r6
                void r0 = r0.setWindow(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.getSourceLanguage():com.amplifyframework.predictions.models.LanguageType");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 ??, still in use, count: 1, list:
              (r0v15 ?? I:??[int, byte, short, char]) from 0x0024: IF  (r0v15 ?? I:??[int, byte, short, char]) <= (0 ??[int, byte, short, char])  -> B:18:0x0041
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0008: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('methods' org.eclipse.jdt.core.IMethod[])]) (LINE:690), block:B:2:0x0000 */
        public static com.amplifyframework.predictions.models.LanguageType getTargetLanguage() throws java.lang.Exception {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                super/*android.app.Dialog*/.setDismissMessage(r0)
                r4 = r0
                r0 = r3
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L44
            L14:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r5
                boolean r0 = r0.isNull(r5)
                void r0 = r0.<init>(r5)
                if (r0 <= 0) goto L41
                r0 = r5
                boolean r0 = r0.isNull(r5)
                r1 = r5
                void r1 = r1.freeLastRow()
                float r0 = r0.getFloat(r1, r1)
                if (r0 != 0) goto L41
                r0 = r4
                r1 = r5
                boolean r0 = r0.isShowing()
            L41:
                int r6 = r6 + 1
            L44:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto L14
                r0 = r4
                android.app.AlertDialog r0 = r0.create()
                r1 = r3
                int r1 = r1.length
                if (r0 != r1) goto L59
                r0 = r3
                goto L66
            L59:
                r0 = r4
                r1 = 0
                org.eclipse.jdt.core.IMethod[] r1 = new org.eclipse.jdt.core.IMethod[r1]
                android.content.res.TypedArray r0 = r0.obtainTypedArray(r1)
                org.eclipse.jdt.core.IMethod[] r0 = (org.eclipse.jdt.core.IMethod[]) r0
            L66:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.getTargetLanguage():com.amplifyframework.predictions.models.LanguageType");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 4, list:
              (r0v0 ?? I:android.os.Message) from 0x0004: INVOKE (r0v0 ?? I:android.app.Dialog), (r0v0 ?? I:android.os.Message) SUPER call: android.app.Dialog.setDismissMessage(android.os.Message):void A[MD:(android.os.Message):void (c)]
              (r0v0 ?? I:android.app.Dialog) from 0x0004: INVOKE (r0v0 ?? I:android.app.Dialog), (r0v0 ?? I:android.os.Message) SUPER call: android.app.Dialog.setDismissMessage(android.os.Message):void A[MD:(android.os.Message):void (c)]
              (r0v0 ?? I:android.app.Dialog A[D('result' java.util.List<org.eclipse.jdt.core.search.SearchMatch>)]) from 0x003a: INVOKE (r0v0 ?? I:android.app.Dialog A[D('result' java.util.List<org.eclipse.jdt.core.search.SearchMatch>)]) INTERFACE call: android.app.Dialog.isShowing():boolean A[MD:():boolean (c)] (LINE:712)
              (r0v0 ?? I:android.content.res.Resources A[D('result' java.util.List<org.eclipse.jdt.core.search.SearchMatch>)]) from 0x004e: INVOKE (r0v4 java.lang.Object) = 
              (r0v0 ?? I:android.content.res.Resources A[D('result' java.util.List<org.eclipse.jdt.core.search.SearchMatch>)])
              (r1v4 ?? I:int)
             INTERFACE call: android.content.res.Resources.obtainTypedArray(int):android.content.res.TypedArray A[MD:(int):android.content.res.TypedArray throws android.content.res.Resources$NotFoundException (c)] (LINE:714)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0044: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('returnValue' org.eclipse.jdt.core.search.SearchMatch[])])
        , block:B:10:0x0043 */
        /* JADX WARN: Type inference failed for: r0v0, names: [result], types: [android.app.Dialog, android.content.res.Resources, android.os.Message, java.util.ArrayList, java.util.List<org.eclipse.jdt.core.search.SearchMatch>] */
        /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String, org.eclipse.jdt.core.search.SearchMatch[]] */
        /* JADX WARN: Type inference failed for: r0v7, names: [searchResult], types: [android.database.CursorWindow, double, int, org.eclipse.jdt.core.search.SearchMatch] */
        /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int, org.eclipse.jdt.core.search.SearchMatch[]] */
        /* renamed from: getText, reason: collision with other method in class */
        public static java.lang.String m68965getText() {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                super/*android.app.Dialog*/.setDismissMessage(r0)
                r4 = r0
                r0 = 0
                r5 = r0
                goto L43
            Ld:
                r0 = r3
                r1 = r5
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                boolean r0 = r0.putDouble(r6, r0, r0)
                boolean r0 = r0 instanceof org.eclipse.jdt.core.IField
                if (r0 == 0) goto L38
                r0 = r6
                boolean r0 = r0.putDouble(r6, r0, r0)
                org.eclipse.jdt.core.IField r0 = (org.eclipse.jdt.core.IField) r0
                r7 = r0
                r0 = r7
                java.lang.String r1 = "Generated"
                int r0 = r0.getCount()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L38
                goto L40
            L38:
                r0 = r4
                r1 = r6
                boolean r0 = r0.isShowing()
            L40:
                int r5 = r5 + 1
            L43:
                r0 = r5
                r1 = r3
                int r1 = r1.length
                if (r0 < r1) goto Ld
                r0 = r4
                r1 = 0
                org.eclipse.jdt.core.search.SearchMatch[] r1 = new org.eclipse.jdt.core.search.SearchMatch[r1]
                android.content.res.TypedArray r0 = r0.obtainTypedArray(r1)
                org.eclipse.jdt.core.search.SearchMatch[] r0 = (org.eclipse.jdt.core.search.SearchMatch[]) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68965getText():java.lang.String");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 ??, still in use, count: 2, list:
              (r3v0 ?? I:??[OBJECT, ARRAY]) from 0x004b: APUT (r0v14 ?? I:??[OBJECT, ARRAY][]), (0 ??[int, short, byte, char]), (r3v0 ?? I:??[OBJECT, ARRAY])
              (r3v0 ?? I:android.database.sqlite.SQLiteProgram) from 0x0048: INVOKE (r3v0 ?? I:android.database.sqlite.SQLiteProgram), (0 int), (r6v1 ?? I:java.lang.String) SUPER call: android.database.sqlite.SQLiteProgram.bindString(int, java.lang.String):void A[MD:(int, java.lang.String):void (c)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        /* JADX WARN: Failed to calculate best type for var: r9v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r9v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('returnValue' org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[])])
         (LINE:722), block:B:2:0x0000 */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0009: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('processor' java.lang.Object)]) (LINE:724), block:B:6:0x0009 */
        /* JADX WARN: Type inference failed for: r0v10, types: [android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteProgram, double] */
        /* JADX WARN: Type inference failed for: r0v11, types: [void] */
        /* JADX WARN: Type inference failed for: r0v14, types: [org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[], void] */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Fragment, java.lang.Class] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, android.database.sqlite.SQLiteDatabase, java.lang.String[], void] */
        /* JADX WARN: Type inference failed for: r0v7, types: [void] */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.database.sqlite.SQLiteProgram, org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, org.eclipse.jdt.core.search.SearchMatch[]] */
        /* JADX WARN: Type inference failed for: r8v0, types: [void] */
        /* JADX WARN: Type inference failed for: r9v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68956init() throws java.lang.Exception {
            /*
                r0 = r8
                if (r0 == 0) goto L9
                r0 = r8
                int r0 = r0.length
                if (r0 != 0) goto L4d
            L9:
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "fField"
                void r0 = r0.onDestroy()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L4d
                r0 = r10
                r1 = 1
                r0.rawQuery(r1, r0)
                r0 = r10
                r1 = r9
                void r0 = r0.addListener(r1)
                org.eclipse.jdt.internal.core.SourceField r0 = (org.eclipse.jdt.internal.core.SourceField) r0
                r11 = r0
                r0 = r11
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
                java.lang.String r1 = "Data"
                void r0 = r0.bindDouble(r1, r0)
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L4d
                r0 = 1
                org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[] r0 = new org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[r0]
                r1 = r0
                r2 = 0
                org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup r3 = new org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup
                r4 = r3
                r5 = 0
                r6 = 1
                org.eclipse.jdt.core.search.SearchMatch[] r6 = new org.eclipse.jdt.core.search.SearchMatch[r6]
                super/*android.database.sqlite.SQLiteProgram*/.bindString(r5, r6)
                r1[r2] = r3
                return r0
            L4d:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68956init():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.animation.Animator, java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r0v16, types: [void] */
        /* JADX WARN: Type inference failed for: r0v23, types: [void] */
        /* JADX WARN: Type inference failed for: r0v7, types: [org.eclipse.jdt.core.dom.SimpleName[], void] */
        /* renamed from: <init>, reason: not valid java name */
        public static void m68957init(id5 id5Var) throws Exception {
            ?? field = SimpleName.class.getField("$isGenerated");
            int count = 0;
            for (int i = 0; i < id5Var.length; i++) {
                if (id5Var[i] == 0 || !((Boolean) field.addListener(id5Var[i])).booleanValue()) {
                    count++;
                }
            }
            if (count == id5Var.length) {
                return id5Var;
            }
            ?? r0 = new SimpleName[count];
            int count2 = 0;
            for (int i2 = 0; i2 < id5Var.length; i2++) {
                if (id5Var[i2] == 0 || !((Boolean) field.addListener(id5Var[i2])).booleanValue()) {
                    int i3 = count2;
                    count2++;
                    r0[i3] = id5Var[i2];
                }
            }
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to apply debug info
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v11 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r2v3 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:565)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r6v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r6v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x000b: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('out' org.eclipse.jdt.internal.compiler.ast.Annotation[])])
         (LINE:760), block:B:3:0x000a */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x000d: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
          (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('out' org.eclipse.jdt.internal.compiler.ast.Annotation[])])
         (LINE:763), block:B:5:0x000d */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('annotatable' org.eclipse.jdt.core.IAnnotatable)]) A[TRY_ENTER] (LINE:758), block:B:2:0x0000 */
        static {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lombok.launch.PatchFixesHider.PatchFixes.m68958clinit():void");
        }
    }
}
