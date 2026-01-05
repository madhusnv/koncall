package p001o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C2066c;

/* loaded from: classes2.dex */
public final class s56 {

    /* renamed from: a */
    public final C16746b f44826a;

    /* renamed from: o.s56$a */
    public static class C16745a extends C16746b {

        /* renamed from: a */
        public final TextView f44827a;

        /* renamed from: b */
        public final p56 f44828b;

        /* renamed from: c */
        public boolean f44829c = true;

        public C16745a(TextView textView) {
            this.f44827a = textView;
            this.f44828b = new p56(textView);
        }

        @Override // p001o.s56.C16746b
        /* renamed from: a */
        public InputFilter[] mo47860a(InputFilter[] inputFilterArr) {
            return !this.f44829c ? m47867h(inputFilterArr) : m47865f(inputFilterArr);
        }

        @Override // p001o.s56.C16746b
        /* renamed from: b */
        public boolean mo47861b() {
            return this.f44829c;
        }

        @Override // p001o.s56.C16746b
        /* renamed from: c */
        public void mo47862c(boolean z) {
            if (z) {
                m47871l();
            }
        }

        @Override // p001o.s56.C16746b
        /* renamed from: d */
        public void mo47863d(boolean z) {
            this.f44829c = z;
            m47871l();
            m47870k();
        }

        @Override // p001o.s56.C16746b
        /* renamed from: e */
        public TransformationMethod mo47864e(TransformationMethod transformationMethod) {
            return this.f44829c ? m47872m(transformationMethod) : m47869j(transformationMethod);
        }

        /* renamed from: f */
        public final InputFilter[] m47865f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f44828b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f44828b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        public final SparseArray m47866g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof p56) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        public final InputFilter[] m47867h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayM47866g = m47866g(inputFilterArr);
            if (sparseArrayM47866g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM47866g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayM47866g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: i */
        public void m47868i(boolean z) {
            this.f44829c = z;
        }

        /* renamed from: j */
        public final TransformationMethod m47869j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof u56 ? ((u56) transformationMethod).m50954a() : transformationMethod;
        }

        /* renamed from: k */
        public final void m47870k() {
            this.f44827a.setFilters(mo47860a(this.f44827a.getFilters()));
        }

        /* renamed from: l */
        public void m47871l() {
            this.f44827a.setTransformationMethod(mo47864e(this.f44827a.getTransformationMethod()));
        }

        /* renamed from: m */
        public final TransformationMethod m47872m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof u56) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new u56(transformationMethod);
        }
    }

    /* renamed from: o.s56$b */
    public static class C16746b {
        /* renamed from: a */
        public abstract InputFilter[] mo47860a(InputFilter[] inputFilterArr);

        /* renamed from: b */
        public abstract boolean mo47861b();

        /* renamed from: c */
        public abstract void mo47862c(boolean z);

        /* renamed from: d */
        public abstract void mo47863d(boolean z);

        /* renamed from: e */
        public abstract TransformationMethod mo47864e(TransformationMethod transformationMethod);
    }

    /* renamed from: o.s56$c */
    public static class C16747c extends C16746b {

        /* renamed from: a */
        public final C16745a f44830a;

        public C16747c(TextView textView) {
            this.f44830a = new C16745a(textView);
        }

        @Override // p001o.s56.C16746b
        /* renamed from: a */
        public InputFilter[] mo47860a(InputFilter[] inputFilterArr) {
            return m47873f() ? inputFilterArr : this.f44830a.mo47860a(inputFilterArr);
        }

        @Override // p001o.s56.C16746b
        /* renamed from: b */
        public boolean mo47861b() {
            return this.f44830a.mo47861b();
        }

        @Override // p001o.s56.C16746b
        /* renamed from: c */
        public void mo47862c(boolean z) {
            if (m47873f()) {
                return;
            }
            this.f44830a.mo47862c(z);
        }

        @Override // p001o.s56.C16746b
        /* renamed from: d */
        public void mo47863d(boolean z) {
            if (m47873f()) {
                this.f44830a.m47868i(z);
            } else {
                this.f44830a.mo47863d(z);
            }
        }

        @Override // p001o.s56.C16746b
        /* renamed from: e */
        public TransformationMethod mo47864e(TransformationMethod transformationMethod) {
            return m47873f() ? transformationMethod : this.f44830a.mo47864e(transformationMethod);
        }

        /* renamed from: f */
        public final boolean m47873f() {
            return !C2066c.m6068i();
        }
    }

    public s56(TextView textView, boolean z) {
        fgd.m26664h(textView, "textView cannot be null");
        if (z) {
            this.f44826a = new C16745a(textView);
        } else {
            this.f44826a = new C16747c(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] m47855a(InputFilter[] inputFilterArr) {
        return this.f44826a.mo47860a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m47856b() {
        return this.f44826a.mo47861b();
    }

    /* renamed from: c */
    public void m47857c(boolean z) {
        this.f44826a.mo47862c(z);
    }

    /* renamed from: d */
    public void m47858d(boolean z) {
        this.f44826a.mo47863d(z);
    }

    /* renamed from: e */
    public TransformationMethod m47859e(TransformationMethod transformationMethod) {
        return this.f44826a.mo47864e(transformationMethod);
    }
}
