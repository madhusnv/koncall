package v6;

import android.text.Editable;
import u6.C7350d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.a */
/* loaded from: classes.dex */
public final class C7675a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f37158a = new Object();

    /* renamed from: b */
    public static volatile C7675a f37159b;

    /* renamed from: c */
    public static Class f37160c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f37160c;
        return cls != null ? new C7350d(cls, charSequence) : super.newEditable(charSequence);
    }
}
