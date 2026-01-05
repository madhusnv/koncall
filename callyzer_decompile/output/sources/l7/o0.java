package l7;

import ba.AbstractC0638h;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b */
    public static final LinkedHashMap f22090b = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap f22091a = new LinkedHashMap();

    /* renamed from: a */
    public final void m9232a(n0 navigator) {
        AbstractC4154l.m8923f(navigator, "navigator");
        String strM1854b = AbstractC0638h.m1854b(navigator.getClass());
        if (strM1854b.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f22091a;
        n0 n0Var = (n0) linkedHashMap.get(strM1854b);
        if (AbstractC4154l.m8918a(n0Var, navigator)) {
            return;
        }
        if (n0Var != null && n0Var.f22087b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + n0Var).toString());
        }
        if (!navigator.f22087b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* renamed from: b */
    public final n0 m9233b(String name) {
        AbstractC4154l.m8923f(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        n0 n0Var = (n0) this.f22091a.get(name);
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException(AbstractC5601a.m11238i("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
