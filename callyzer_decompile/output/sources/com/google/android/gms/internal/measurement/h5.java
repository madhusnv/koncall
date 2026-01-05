package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h5 implements Cloneable {

    /* renamed from: a */
    public final i5 f6230a;

    /* renamed from: b */
    public i5 f6231b;

    public h5(i5 i5Var) {
        this.f6230a = i5Var;
        if (i5Var.m3336e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6231b = (i5) i5Var.mo3102o(4);
    }

    /* renamed from: a */
    public static void m3302a(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* renamed from: b */
    public final void m3303b() {
        if (this.f6231b.m3336e()) {
            return;
        }
        i5 i5Var = (i5) this.f6230a.mo3102o(4);
        f6.f6193c.m3269a(i5Var.getClass()).mo3165c(i5Var, this.f6231b);
        this.f6231b = i5Var;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h5 clone() {
        h5 h5Var = (h5) this.f6230a.mo3102o(5);
        h5Var.f6231b = m3305d();
        return h5Var;
    }

    /* renamed from: d */
    public final i5 m3305d() {
        if (!this.f6231b.m3336e()) {
            return this.f6231b;
        }
        this.f6231b.m3338g();
        return this.f6231b;
    }

    /* renamed from: e */
    public final i5 m3306e() {
        i5 i5VarM3305d = m3305d();
        i5VarM3305d.getClass();
        boolean zMo3164b = true;
        byte bByteValue = ((Byte) i5VarM3305d.mo3102o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo3164b = false;
            } else {
                zMo3164b = f6.f6193c.m3269a(i5VarM3305d.getClass()).mo3164b(i5VarM3305d);
                i5VarM3305d.mo3102o(2);
            }
        }
        if (zMo3164b) {
            return i5VarM3305d;
        }
        throw new zzoh("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: f */
    public final void m3307f(i5 i5Var) {
        i5 i5Var2 = this.f6230a;
        if (i5Var2.equals(i5Var)) {
            return;
        }
        if (!this.f6231b.m3336e()) {
            i5 i5Var3 = (i5) i5Var2.mo3102o(4);
            f6.f6193c.m3269a(i5Var3.getClass()).mo3165c(i5Var3, this.f6231b);
            this.f6231b = i5Var3;
        }
        i5 i5Var4 = this.f6231b;
        f6.f6193c.m3269a(i5Var4.getClass()).mo3165c(i5Var4, i5Var);
    }

    /* renamed from: g */
    public final void m3308g(byte[] bArr, int i10, b5 b5Var) throws zzmr {
        if (!this.f6231b.m3336e()) {
            i5 i5Var = (i5) this.f6230a.mo3102o(4);
            f6.f6193c.m3269a(i5Var.getClass()).mo3165c(i5Var, this.f6231b);
            this.f6231b = i5Var;
        }
        try {
            i6 i6VarM3269a = f6.f6193c.m3269a(this.f6231b.getClass());
            i5 i5Var2 = this.f6231b;
            w4 w4Var = new w4();
            b5Var.getClass();
            i6VarM3269a.mo3170h(i5Var2, bArr, 0, i10, w4Var);
        } catch (zzmr e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
