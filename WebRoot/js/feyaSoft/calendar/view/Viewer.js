/**
 * FeyaSoft MyCalendar
 * Copyright(c) 2006-2012, FeyaSoft Inc. All right reserved.
 * info@cubedrive.com
 * http://www.cubedrive.com
 *
 * Please read license first before your use myCalendar, For more detail
 * information, please can visit our link: http://www.cubedrive.com/myCalendar
 *
 * You need buy one of the Feyasoft's License if you want to use MyCalendar in
 * your commercial product. You must not remove, obscure or interfere with any
 * FeyaSoft copyright, acknowledgment, attribution, trademark, warning or
 * disclaimer statement affixed to, incorporated in or otherwise applied in
 * connection with the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY,FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

Ext.onReady(function() {
    Ext.tip.QuickTipManager.init();
    Ext.QuickTips.init();
//	var lan = Ext.ux.calendar.Mask.CalendarContainer;
    var wait = new Ext.LoadMask(document.body, {
        msg : '<b>欢迎使用日程管理请稍后, 配置信息加载中</b>...'
    });
    wait.show();

    // hard code userId
    // In you real application, you do not need pass userId
    // Suppose end user need login to your system and your system will know
    // who are using this calendar. You can ignore this parameter. Not harm
    // to keep this.
    var userId = document.getElementById("userId").value;
    var ds = new Ext.ux.calendar.DataSource();

    ds.initialLoad(userId, function(backObj) {
        var cs = backObj.cs;
        ds.initialObj = backObj;
        if (!cs['language']) {
            var params = Ext.urlDecode(window.location.search .substring(1));
            if (params.lang) {
                cs.language = params.lang;
            } else {
                cs.language = 'zh_CN';
            }
        }
            /*
             * here add the related language file
             */
            if(Ext.ux.calendar.CONST.SHOW_LANGUAGE_MENU){
                Ext.ux.calendar.LanManager.addJavaScript(cs.language);
            }
			
            var count = 0;
            var fn = function() {
                if (!Ext.ux.calendar.Language && count++ < 40) {
                    /*
                     * need defer to wait the js file loaded
                     */
                    Ext.defer(fn, 50)
                } else {

                    var mp = Ext.create('Ext.ux.calendar.MainPanel', { 
                    	title : '欢迎使用日程管理',
                    	 /*
                    	tools : [{
                            type : 'close',
                            handler : function(){                            	
                            	window.close();
                            }
                        }],
                    	  */
                        datasource : ds,
                        calendarSetting : cs,
                        userId : userId
                    });
                    var dv = Ext.create('Ext.Viewport', {  
                    	layout : 'fit',
                        items : [mp]
                    });
                    wait.hide();
                }
            };
            fn();
    });
});