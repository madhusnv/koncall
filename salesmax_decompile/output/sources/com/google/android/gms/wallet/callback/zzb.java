package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* loaded from: classes3.dex */
final class zzb implements OnCompleteListener<CallbackOutput> {
    private Messenger zza;
    private final int zzb;

    public zzb(Messenger messenger, int i) {
        this.zza = messenger;
        this.zzb = i;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized void complete(CallbackOutput callbackOutput) {
        if (this.zza != null) {
            try {
                Preconditions.checkArgument(callbackOutput.zzb != 0, "Callback Response Status must be set - status value must be non-zero.");
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.arg1 = this.zzb;
                Bundle bundle = new Bundle();
                bundle.putByteArray("extra_callback_output", SafeParcelableSerializer.serializeToBytes(callbackOutput));
                messageObtain.setData(bundle);
                Messenger messenger = this.zza;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.zza = null;
            } catch (RemoteException unused) {
            }
        }
    }
}
