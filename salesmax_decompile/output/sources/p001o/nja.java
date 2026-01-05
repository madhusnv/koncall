package p001o;

import android.util.Log;

/* loaded from: classes6.dex */
public final class nja implements tja {

    /* renamed from: a */
    public final int f36912a;

    /* renamed from: b */
    public final String f36913b;

    public nja(int i, String str) {
        sq8.m48649h(str, "tag");
        this.f36912a = i;
        this.f36913b = str;
    }

    @Override // p001o.tja
    /* renamed from: a */
    public void mo40675a(Exception exc) {
        sq8.m48649h(exc, "e");
        exc.getMessage();
    }

    @Override // p001o.tja
    /* renamed from: b */
    public void mo40676b(String str) {
        sq8.m48649h(str, "msg");
        Log.println(this.f36912a, this.f36913b, str);
    }
}
