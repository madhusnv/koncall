package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* loaded from: classes2.dex */
public interface e85 {
    /* renamed from: a */
    boolean mo4452a();

    /* renamed from: b */
    boolean mo4453b();

    /* renamed from: c */
    boolean mo4454c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo4455d();

    /* renamed from: e */
    boolean mo4456e();

    /* renamed from: f */
    boolean mo4457f();

    /* renamed from: g */
    void mo4458g(int i);

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo4459h(CharSequence charSequence);

    /* renamed from: i */
    Menu mo4460i();

    /* renamed from: j */
    int mo4461j();

    /* renamed from: k */
    xyi mo4462k(int i, long j);

    /* renamed from: l */
    ViewGroup mo4463l();

    /* renamed from: m */
    void mo4464m(boolean z);

    /* renamed from: n */
    void mo4465n();

    /* renamed from: o */
    void mo4466o(boolean z);

    /* renamed from: p */
    void mo4467p();

    /* renamed from: q */
    void mo4468q(ScrollingTabContainerView scrollingTabContainerView);

    /* renamed from: r */
    void mo4469r(int i);

    /* renamed from: s */
    void mo4470s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, InterfaceC1796i.a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo4471t(InterfaceC1796i.a aVar, C1792e.a aVar2);

    /* renamed from: u */
    int mo4472u();

    /* renamed from: v */
    void mo4473v();
}
