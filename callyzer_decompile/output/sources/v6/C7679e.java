package v6;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import pg.g6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.e */
/* loaded from: classes.dex */
public final class C7679e extends g6 {

    /* renamed from: a */
    public final TextView f37166a;

    /* renamed from: b */
    public final C7677c f37167b;

    /* renamed from: c */
    public boolean f37168c = true;

    public C7679e(TextView textView) {
        this.f37166a = textView;
        this.f37167b = new C7677c(textView);
    }

    @Override // pg.g6
    /* renamed from: a */
    public final InputFilter[] mo11652a(InputFilter[] inputFilterArr) {
        if (!this.f37168c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C7677c) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            C7677c c7677c = this.f37167b;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7677c;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == c7677c) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // pg.g6
    /* renamed from: d */
    public final boolean mo11653d() {
        return this.f37168c;
    }

    @Override // pg.g6
    /* renamed from: f */
    public final void mo11654f(boolean z6) {
        if (z6) {
            m14686j();
        }
    }

    @Override // pg.g6
    /* renamed from: g */
    public final void mo11655g(boolean z6) {
        this.f37168c = z6;
        m14686j();
        TextView textView = this.f37166a;
        textView.setFilters(mo11652a(textView.getFilters()));
    }

    /* renamed from: j */
    public final void m14686j() {
        TextView textView = this.f37166a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f37168c) {
            if (!(transformationMethod instanceof C7682h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C7682h(transformationMethod);
            }
        } else if (transformationMethod instanceof C7682h) {
            transformationMethod = ((C7682h) transformationMethod).f37172a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
