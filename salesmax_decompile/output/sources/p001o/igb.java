package p001o;

/* loaded from: classes6.dex */
public final class igb extends jpa implements mk5 {

    /* renamed from: c */
    public final Throwable f28646c;

    /* renamed from: d */
    public final String f28647d;

    public igb(Throwable th, String str) {
        this.f28646c = th;
        this.f28647d = str;
    }

    @Override // p001o.z74
    public boolean k0(q74 q74Var) {
        y0();
        throw new qe9();
    }

    @Override // p001o.jpa, p001o.z74
    public z74 l0(int i, String str) {
        y0();
        throw new qe9();
    }

    @Override // p001o.jpa
    public jpa r0() {
        return this;
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        y0();
        throw new qe9();
    }

    @Override // p001o.z74
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f28646c != null) {
            str = ", cause=" + this.f28646c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // p001o.z74
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Void mo22314K(q74 q74Var, Runnable runnable) {
        y0();
        throw new qe9();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void y0() {
        String str;
        if (this.f28646c == null) {
            lpa.m37588d();
            throw new qe9();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f28647d;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString(), this.f28646c);
    }

    @Override // p001o.mk5
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public Void mo26962D(long j, xb2 xb2Var) {
        y0();
        throw new qe9();
    }
}
