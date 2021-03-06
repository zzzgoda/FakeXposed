/*
 * Copyright (c) 2021 FakeXposed by sanfengAndroid.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.sanfengandroid.common.model;

import android.content.Context;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;
import com.sanfengandroid.datafilter.R;
import com.sanfengandroid.datafilter.ui.FileBrowseLayout;

public class FileBlacklistModel extends StringModel {

    @Override
    protected String getInputHint(Context context) {
        return context.getString(R.string.add_item_key_file_blacklist);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public View onCreateView(Context context) {
        View view = super.onCreateView(context);
        TextInputLayout tl = view.findViewById(R.id.item_key);
        FileBrowseLayout.setFileBrowse(context, tl, (success, path) -> et.setText(path));
        return view;
    }
}
