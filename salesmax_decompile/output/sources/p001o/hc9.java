package p001o;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class hc9 {

    /* renamed from: f */
    public static int f26654f = -1;

    /* renamed from: a */
    public int f26655a;

    /* renamed from: b */
    public int f26656b;

    /* renamed from: c */
    public String f26657c;

    /* renamed from: d */
    public int f26658d;

    /* renamed from: e */
    public HashMap f26659e;

    public hc9() {
        int i = f26654f;
        this.f26655a = i;
        this.f26656b = i;
        this.f26657c = null;
    }

    /* renamed from: a */
    public abstract void mo24787a(HashMap map);

    /* renamed from: b */
    public abstract hc9 mo24788b();

    /* renamed from: c */
    public hc9 mo24789c(hc9 hc9Var) {
        this.f26655a = hc9Var.f26655a;
        this.f26656b = hc9Var.f26656b;
        this.f26657c = hc9Var.f26657c;
        this.f26658d = hc9Var.f26658d;
        this.f26659e = hc9Var.f26659e;
        return this;
    }

    /* renamed from: d */
    public abstract void mo26461d(HashSet hashSet);

    /* renamed from: e */
    public abstract void mo24790e(Context context, AttributeSet attributeSet);

    /* renamed from: f */
    public boolean m30223f(String str) {
        String str2 = this.f26657c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: g */
    public void m30224g(int i) {
        this.f26655a = i;
    }

    /* renamed from: h */
    public void mo30225h(HashMap map) {
    }

    /* renamed from: i */
    public hc9 m30226i(int i) {
        this.f26656b = i;
        return this;
    }

    /* renamed from: j */
    public boolean m30227j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: k */
    public float m30228k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: l */
    public int m30229l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
