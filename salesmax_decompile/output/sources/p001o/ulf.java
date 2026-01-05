package p001o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public class ulf extends slf {

    /* renamed from: o.ulf$a */
    public class C17398a extends ViewOutlineProvider {
        public C17398a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ulf.this.f45624e.isEmpty()) {
                return;
            }
            outline.setPath(ulf.this.f45624e);
        }
    }

    public ulf(View view) {
        m51770l(view);
    }

    /* renamed from: l */
    private void m51770l(View view) {
        view.setOutlineProvider(new C17398a());
    }

    @Override // p001o.slf
    /* renamed from: b */
    public void mo48490b(View view) {
        view.setClipToOutline(!mo48498j());
        if (mo48498j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p001o.slf
    /* renamed from: j */
    public boolean mo48498j() {
        return this.f45620a;
    }
}
