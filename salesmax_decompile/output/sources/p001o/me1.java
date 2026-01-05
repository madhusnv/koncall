package p001o;

import ai.salesmax.util.Prefs;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public interface me1 extends ja8, h68 {
    List A9();

    String Eo();

    default g0i U9() {
        return g0i.m27854h(on(), Eo());
    }

    default Boolean ce() {
        return isDummyAccount(on());
    }

    List eh();

    x6c mz(String str);

    default Prefs oa(Context context) {
        Prefs prefs = new Prefs(context);
        prefs.E0(Eo(), on());
        return prefs;
    }

    String on();

    x6c tn();

    Prefs wa();

    default String zz() {
        return (String) ((List) Optional.ofNullable(eh()).orElse(Collections.emptyList())).stream().map(new tu()).findFirst().orElse((String) ((List) Optional.ofNullable(A9()).orElse(Collections.emptyList())).stream().map(new tu()).findFirst().orElse(null));
    }
}
