package b6;

import j5.C3586c;
import kotlin.jvm.internal.AbstractC4154l;
import z4.C8863a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b6.c */
/* loaded from: classes.dex */
public class C0602c {

    /* renamed from: a */
    public final /* synthetic */ int f3987a;

    /* renamed from: b */
    public final Object[] f3988b;

    /* renamed from: c */
    public int f3989c;

    public C0602c(int i10) {
        this.f3987a = 0;
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3988b = new Object[i10];
    }

    /* renamed from: a */
    public Object mo1762a() {
        switch (this.f3987a) {
            case 0:
                int i10 = this.f3989c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object[] objArr = this.f3988b;
                Object obj = objArr[i11];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i11] = null;
                this.f3989c--;
                return obj;
            default:
                int i12 = this.f3989c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object[] objArr2 = this.f3988b;
                Object obj2 = objArr2[i13];
                objArr2[i13] = null;
                this.f3989c = i12 - 1;
                return obj2;
        }
    }

    /* renamed from: b */
    public void m1763b(C3586c c3586c) {
        int i10 = this.f3989c;
        Object[] objArr = this.f3988b;
        if (i10 < objArr.length) {
            objArr[i10] = c3586c;
            this.f3989c = i10 + 1;
        }
    }

    /* renamed from: c */
    public void m1764c(C8863a c8863a) {
        int i10 = this.f3989c;
        Object[] objArr = this.f3988b;
        if (i10 < objArr.length) {
            objArr[i10] = c8863a;
            this.f3989c = i10 + 1;
        }
    }

    /* renamed from: d */
    public boolean mo1765d(Object instance) {
        Object[] objArr;
        boolean z6;
        AbstractC4154l.m8923f(instance, "instance");
        int i10 = this.f3989c;
        int i11 = 0;
        while (true) {
            objArr = this.f3988b;
            if (i11 >= i10) {
                z6 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z6 = true;
                break;
            }
            i11++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f3989c;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f3989c = i12 + 1;
        return true;
    }

    public C0602c(byte b10, int i10) {
        this.f3987a = i10;
        switch (i10) {
            case 2:
                this.f3988b = new Object[256];
                break;
            default:
                this.f3988b = new Object[256];
                break;
        }
    }
}
