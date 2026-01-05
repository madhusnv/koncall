package ug;

import android.content.SharedPreferences;
import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final String f35308a;

    /* renamed from: b */
    public final long f35309b;

    /* renamed from: c */
    public boolean f35310c;

    /* renamed from: d */
    public long f35311d;

    /* renamed from: e */
    public final /* synthetic */ d1 f35312e;

    public c1(d1 d1Var, String str, long j6) {
        Objects.requireNonNull(d1Var);
        this.f35312e = d1Var;
        AbstractC6840z.m13033d(str);
        this.f35308a = str;
        this.f35309b = j6;
    }

    /* renamed from: a */
    public final long m13856a() {
        if (!this.f35310c) {
            this.f35310c = true;
            this.f35311d = this.f35312e.m13861Q().getLong(this.f35308a, this.f35309b);
        }
        return this.f35311d;
    }

    /* renamed from: b */
    public final void m13857b(long j6) {
        SharedPreferences.Editor editorEdit = this.f35312e.m13861Q().edit();
        editorEdit.putLong(this.f35308a, j6);
        editorEdit.apply();
        this.f35311d = j6;
    }
}
