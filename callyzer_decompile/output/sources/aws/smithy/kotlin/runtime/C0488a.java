package aws.smithy.kotlin.runtime;

import ec.C2003a;
import ec.C2005c;
import og.ud;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aws.smithy.kotlin.runtime.a */
/* loaded from: classes.dex */
public class C0488a {

    /* renamed from: b */
    public static final C2003a f3500b = new C2003a("aws.smithy.kotlin#ClientContext");

    /* renamed from: c */
    public static final C2003a f3501c = new C2003a("aws.smithy.kotlin#Retryable");

    /* renamed from: d */
    public static final C2003a f3502d = new C2003a("aws.smithy.kotlin#ThrottlingError");

    /* renamed from: a */
    public final C2005c f3503a = ud.m10980f();

    /* renamed from: a */
    public final boolean m1482a() {
        Boolean bool = (Boolean) this.f3503a.mo1864e(f3501c);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
