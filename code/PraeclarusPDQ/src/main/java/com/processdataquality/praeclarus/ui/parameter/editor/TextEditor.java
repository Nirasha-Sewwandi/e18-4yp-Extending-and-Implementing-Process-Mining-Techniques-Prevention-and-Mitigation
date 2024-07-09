/*
 * Copyright (c) 2022 Queensland University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.processdataquality.praeclarus.ui.parameter.editor;

import com.processdataquality.praeclarus.option.HasOptions;
import com.processdataquality.praeclarus.option.Option;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.data.value.ValueChangeMode;

/**
 * @author Michael Adams
 * @date 5/5/21
 */

public class TextEditor extends AbstractEditor {

    public TextEditor(HasOptions container, Option option) {
        super(container, option);
    }


    protected TextArea createField() {
        TextArea ta = new TextArea();
        ta.setWidth("75%");

        String value = getOption().asString();
        if (value.equals("null")) value = "";
        ta.setValue(value);

        ta.setValueChangeMode(ValueChangeMode.ON_BLUR);
        ta.addValueChangeListener(e -> updateOption(e.getValue()));

        return ta;
    }

}
