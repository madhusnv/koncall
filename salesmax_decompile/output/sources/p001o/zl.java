package p001o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AbstractC2145n;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class zl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2145n f57354a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f57354a.removeObservers((AppCompatActivity) obj);
    }
}
