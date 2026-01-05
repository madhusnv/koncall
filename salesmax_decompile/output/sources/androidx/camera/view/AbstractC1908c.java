package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import java.util.concurrent.Executor;
import p001o.bgg;
import p001o.zfa;

/* renamed from: androidx.camera.view.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1908c {

    /* renamed from: a */
    public Size f6180a;

    /* renamed from: b */
    public FrameLayout f6181b;

    /* renamed from: c */
    public final C1907b f6182c;

    /* renamed from: d */
    public boolean f6183d = false;

    /* renamed from: androidx.camera.view.c$a */
    public interface a {
        /* renamed from: a */
        void mo4792a();
    }

    public AbstractC1908c(FrameLayout frameLayout, C1907b c1907b) {
        this.f6181b = frameLayout;
        this.f6182c = c1907b;
    }

    /* renamed from: a */
    public Bitmap m4782a() {
        Bitmap bitmapMo4784c = mo4784c();
        if (bitmapMo4784c == null) {
            return null;
        }
        return this.f6182c.m4765a(bitmapMo4784c, new Size(this.f6181b.getWidth(), this.f6181b.getHeight()), this.f6181b.getLayoutDirection());
    }

    /* renamed from: b */
    public abstract View mo4783b();

    /* renamed from: c */
    public abstract Bitmap mo4784c();

    /* renamed from: d */
    public abstract void mo4785d();

    /* renamed from: e */
    public abstract void mo4786e();

    /* renamed from: f */
    public void m4787f() {
        this.f6183d = true;
        m4789h();
    }

    /* renamed from: g */
    public abstract void mo4788g(bgg bggVar, a aVar);

    /* renamed from: h */
    public void m4789h() {
        View viewMo4783b = mo4783b();
        if (viewMo4783b == null || !this.f6183d) {
            return;
        }
        this.f6182c.m4781s(new Size(this.f6181b.getWidth(), this.f6181b.getHeight()), this.f6181b.getLayoutDirection(), viewMo4783b);
    }

    /* renamed from: i */
    public abstract void mo4790i(Executor executor, PreviewView.InterfaceC1901d interfaceC1901d);

    /* renamed from: j */
    public abstract zfa mo4791j();
}
