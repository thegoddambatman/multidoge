/**
 * Copyright 2011 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.viewsystem.swing.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import org.multibit.Localiser;
import org.multibit.controller.ActionForward;
import org.multibit.controller.MultiBitController;

/**
 * This {@link Action} shows the MultiBit help
 */
public class ShowHelpContentsAction extends AbstractAction {

    private static final long serialVersionUID = 1923492460523457765L;

    private MultiBitController controller;
    
    /**
     * Creates a new {@link ShowHelpContentsAction}.
     */
    public ShowHelpContentsAction(MultiBitController controller, Localiser localiser, ImageIcon icon) {
        super(localiser.getString("showHelpContentsAction.text"), icon);
        this.controller = controller;

        MnemonicUtil mnemonicUtil = new MnemonicUtil(controller.getLocaliser());
        putValue(SHORT_DESCRIPTION, localiser.getString("showHelpContentsAction.tooltip"));
        putValue(MNEMONIC_KEY, mnemonicUtil.getMnemonic("showHelpContentsAction.mnemonicKey"));
    }

    /**
     * forward to the help contents view
     */
    public void actionPerformed(ActionEvent e) { 
        controller.setActionForwardToChild(ActionForward.FORWARD_TO_HELP_CONTENTS);
     }
}