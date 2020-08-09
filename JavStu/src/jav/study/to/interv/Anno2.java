package jav.study.to.interv;

import java.util.Date;

/*henv supper warning to turn-off the compiler's warning*/
public class Anno2 {
	/*henv: this code got some warning that Constructor is deprecated 
	 * but Annotation @Deprecated was hide that waring, be comfor :) */
	@Deprecated
	Date dateVariable = new Date(2020, 10, 10);
	
}
