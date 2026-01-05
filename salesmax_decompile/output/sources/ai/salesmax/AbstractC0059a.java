package ai.salesmax;

import ai.salesmax.util.Prefs;
import p001o.gi9;
import p001o.kf9;
import p001o.si9;
import p001o.sq8;
import p001o.uk7;

/* renamed from: ai.salesmax.a */
/* loaded from: classes.dex */
public abstract class AbstractC0059a {

    /* renamed from: a */
    public static final gi9 f255a = si9.m48360a(a.f256a);

    /* renamed from: ai.salesmax.a$a */
    public static final class a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final a f256a = new a();

        public a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Prefs invoke() {
            Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
            sq8.m48646e(prefsM127c);
            return prefsM127c;
        }
    }

    /* renamed from: a */
    public static final Prefs m132a() {
        return (Prefs) f255a.getValue();
    }
}
