package p001o;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public abstract class rc9 {
    /* renamed from: a */
    public static final long m46511a(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "$this$key");
        return od9.m42074a(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m46512b(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? qc9.f41620a.m45093c() : qc9.f41620a.m45092b() : qc9.f41620a.m45091a();
    }

    /* renamed from: c */
    public static final boolean m46513c(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
