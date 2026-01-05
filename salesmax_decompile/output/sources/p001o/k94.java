package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class k94 implements ax7 {

    /* renamed from: a */
    public final int f31668a = 4;

    /* renamed from: b */
    public final int f31669b = 4;

    @Override // p001o.ax7
    /* renamed from: a */
    public byte[] mo17932a() {
        int iMo33424d = mo33424d();
        reset();
        return new byte[]{(byte) j0i.m33018c(j0i.m33018c(iMo33424d >>> 24) & Constants.MAX_HOST_LENGTH), (byte) j0i.m33018c(j0i.m33018c(iMo33424d >>> 16) & Constants.MAX_HOST_LENGTH), (byte) j0i.m33018c(j0i.m33018c(iMo33424d >>> 8) & Constants.MAX_HOST_LENGTH), (byte) j0i.m33018c(iMo33424d & Constants.MAX_HOST_LENGTH)};
    }

    @Override // p001o.ax7
    /* renamed from: c */
    public int mo17934c() {
        return this.f31668a;
    }

    /* renamed from: d */
    public abstract int mo33424d();
}
