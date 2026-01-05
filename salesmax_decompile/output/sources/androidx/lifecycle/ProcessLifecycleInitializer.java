package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C2147p;
import java.util.List;
import p001o.ch3;
import p001o.lm0;
import p001o.pi8;
import p001o.sq8;
import p001o.xca;

/* loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements pi8 {
    @Override // p001o.pi8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xca create(Context context) {
        sq8.m48649h(context, "context");
        lm0 lm0VarM37453e = lm0.m37453e(context);
        sq8.m48648g(lm0VarM37453e, "getInstance(context)");
        if (!lm0VarM37453e.m37459g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        C2141j.m6532a(context);
        C2147p.b bVar = C2147p.f7702q;
        bVar.m6566b(context);
        return bVar.m6565a();
    }

    @Override // p001o.pi8
    public List dependencies() {
        return ch3.m21246k();
    }
}
