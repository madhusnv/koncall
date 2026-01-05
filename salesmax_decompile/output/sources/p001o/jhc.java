package p001o;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jhc {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 3, list:
          (r0v0 ?? I:java.lang.Class) from 0x0002: INVOKE (r0v0 ?? I:java.lang.Class), (r0v0 ?? I:java.lang.String) DIRECT call: java.lang.Class.getField(java.lang.String):java.lang.reflect.Field A[MD:(java.lang.String):java.lang.reflect.Field throws java.lang.NoSuchFieldException (c)]
          (r0v0 ?? I:java.lang.String) from 0x0002: INVOKE (r0v0 ?? I:java.lang.Class), (r0v0 ?? I:java.lang.String) DIRECT call: java.lang.Class.getField(java.lang.String):java.lang.reflect.Field A[MD:(java.lang.String):java.lang.reflect.Field throws java.lang.NoSuchFieldException (c)]
          (r0v0 ?? I:android.adservices.customaudience.TrustedBiddingData$Builder) from 0x0005: RETURN (r0v0 ?? I:android.adservices.customaudience.TrustedBiddingData$Builder)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.adservices.customaudience.TrustedBiddingData$Builder, java.lang.Class, java.lang.String] */
    /* renamed from: a */
    public static /* synthetic */ android.adservices.customaudience.TrustedBiddingData.Builder m33841a() {
        /*
            android.adservices.customaudience.TrustedBiddingData$Builder r0 = new android.adservices.customaudience.TrustedBiddingData$Builder
            r0.getField(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.jhc.m33841a():android.adservices.customaudience.TrustedBiddingData$Builder");
    }
}
