package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Objects;

/* loaded from: classes6.dex */
public class nd9 {

    /* renamed from: a */
    public final String f36704a;

    /* renamed from: b */
    public final Object f36705b;

    public nd9(String str, Object obj) {
        this.f36704a = str;
        this.f36705b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nd9 nd9Var = (nd9) obj;
        return Objects.equals(this.f36704a, nd9Var.f36704a) && Objects.equals(this.f36705b, nd9Var.f36705b);
    }

    public int hashCode() {
        return Objects.hash(this.f36704a, this.f36705b);
    }

    public String toString() {
        return String.valueOf(this.f36704a) + "=\"" + String.valueOf(this.f36705b) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }
}
