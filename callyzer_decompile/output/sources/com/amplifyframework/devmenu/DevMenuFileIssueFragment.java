package com.amplifyframework.devmenu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.j0;
import com.amplifyframework.core.C1183R;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DevMenuFileIssueFragment extends j0 {
    private static final String DESCRIPTION_LENGTH_ERROR = "Issue description must be at least 20 characters.";
    private static final int MIN_DESCRIPTION_LENGTH = 20;
    private static final String NEW_ISSUE_URL = "https://github.com/aws-amplify/amplify-android/issues/new";
    private DeveloperMenu developerMenu;
    private View fileIssueView;

    private void fileIssue() {
        String issueBody = getIssueBody();
        if (issueBody.isEmpty()) {
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(NEW_ISSUE_URL).buildUpon().appendQueryParameter(MessageBundle.TITLE_ENTRY, "").appendQueryParameter("body", issueBody).build()));
    }

    private String getIssueBody() {
        EditText editText = (EditText) this.fileIssueView.findViewById(C1183R.id.issue_description);
        String string = editText.getText().toString();
        if (string.length() >= 20) {
            return this.developerMenu.createIssueBody(string, false);
        }
        editText.setError(DESCRIPTION_LENGTH_ERROR);
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        fileIssue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(Context context, View view) {
        String issueBody = getIssueBody();
        if (issueBody.isEmpty()) {
            return;
        }
        this.developerMenu.copyToClipboard(issueBody);
        Toast.makeText(context, "Copied issue body to clipboard.", 0).show();
    }

    @Override // androidx.fragment.app.j0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        this.fileIssueView = layoutInflater.inflate(C1183R.layout.dev_menu_fragment_file_issue, viewGroup, false);
        Context applicationContext = requireContext().getApplicationContext();
        this.developerMenu = DeveloperMenu.singletonInstance(applicationContext);
        this.fileIssueView.findViewById(C1183R.id.file_issue).setOnClickListener(new ViewOnClickListenerC1188a(this, i10));
        this.fileIssueView.findViewById(C1183R.id.copy_issue).setOnClickListener(new ViewOnClickListenerC1189b(i10, this, applicationContext));
        return this.fileIssueView;
    }
}
