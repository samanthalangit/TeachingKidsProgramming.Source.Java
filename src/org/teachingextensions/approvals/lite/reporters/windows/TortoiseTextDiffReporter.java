package org.teachingextensions.approvals.lite.reporters.windows;

import org.teachingextensions.approvals.lite.reporters.GenericDiffReporter;

import java.text.MessageFormat;

public class TortoiseTextDiffReporter extends GenericDiffReporter {
    public static final TortoiseTextDiffReporter INSTANCE = new TortoiseTextDiffReporter();
    static final String DIFF_PROGRAM = "C:\\Program Files\\TortoiseSVN\\bin\\TortoiseMerge.exe";
    static final String MESSAGE = MessageFormat
            .format(
                    "Unable to find TortoiseMerge at {0}"
                            + "\nYou can install TortoiseMerge as part "
                            + "of TortoiseSVN at http://tortisesvn.tigris.org",
                    DIFF_PROGRAM);

    public TortoiseTextDiffReporter() {
        super(DIFF_PROGRAM, MESSAGE);
    }
}
