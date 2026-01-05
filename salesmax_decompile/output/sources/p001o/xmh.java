package p001o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class xmh extends ContextWrapper {

    /* renamed from: c */
    public static final Object f53937c = new Object();

    /* renamed from: d */
    public static ArrayList f53938d;

    /* renamed from: a */
    public final Resources f53939a;

    /* renamed from: b */
    public final Resources.Theme f53940b;

    public xmh(Context context) {
        super(context);
        if (!isi.m32706c()) {
            this.f53939a = new zmh(this, context.getResources());
            this.f53940b = null;
            return;
        }
        isi isiVar = new isi(this, context.getResources());
        this.f53939a = isiVar;
        Resources.Theme themeNewTheme = isiVar.newTheme();
        this.f53940b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    public static boolean m56485a(Context context) {
        return ((context instanceof xmh) || (context.getResources() instanceof zmh) || (context.getResources() instanceof isi) || !isi.m32706c()) ? false : true;
    }

    /* renamed from: b */
    public static Context m56486b(Context context) {
        if (!m56485a(context)) {
            return context;
        }
        synchronized (f53937c) {
            ArrayList arrayList = f53938d;
            if (arrayList == null) {
                f53938d = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f53938d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f53938d.remove(size);
                    }
                }
                for (int size2 = f53938d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f53938d.get(size2);
                    xmh xmhVar = weakReference2 != null ? (xmh) weakReference2.get() : null;
                    if (xmhVar != null && xmhVar.getBaseContext() == context) {
                        return xmhVar;
                    }
                }
            }
            xmh xmhVar2 = new xmh(context);
            f53938d.add(new WeakReference(xmhVar2));
            return xmhVar2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f53939a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f53939a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f53940b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f53940b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
