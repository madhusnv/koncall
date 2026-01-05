package ug;

import android.content.SharedPreferences;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a */
    public final String f35277a;

    /* renamed from: b */
    public final boolean f35278b;

    /* renamed from: c */
    public boolean f35279c;

    /* renamed from: d */
    public boolean f35280d;

    /* renamed from: e */
    public final /* synthetic */ d1 f35281e;

    public b1(d1 d1Var, String str, boolean z6) {
        this.f35281e = d1Var;
        AbstractC6840z.m13033d(str);
        this.f35277a = str;
        this.f35278b = z6;
    }

    /* renamed from: a */
    public final boolean m13837a() {
        if (!this.f35279c) {
            this.f35279c = true;
            this.f35280d = this.f35281e.m13861Q().getBoolean(this.f35277a, this.f35278b);
        }
        return this.f35280d;
    }

    /* renamed from: b */
    public final void m13838b(boolean z6) {
        SharedPreferences.Editor editorEdit = this.f35281e.m13861Q().edit();
        editorEdit.putBoolean(this.f35277a, z6);
        editorEdit.apply();
        this.f35280d = z6;
    }
}
