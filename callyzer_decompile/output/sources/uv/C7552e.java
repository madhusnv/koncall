package uv;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uv.e */
/* loaded from: classes3.dex */
public final class C7552e extends ContextWrapper {

    /* renamed from: a */
    public final Context f36417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7552e(Context context, boolean z6) {
        super(context);
        AbstractC4154l.m8923f(context, "context");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.uiMode = (z6 ? 32 : 16) | (configuration.uiMode & (-49));
        this.f36417a = context.createConfigurationContext(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.f36417a.getResources();
        AbstractC4154l.m8922e(resources, "getResources(...)");
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f36417a.getTheme();
        AbstractC4154l.m8922e(theme, "getTheme(...)");
        return theme;
    }
}
