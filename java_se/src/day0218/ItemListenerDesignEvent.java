package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * ItemListenerDesign 의 이벤트를 처리하기 위한 클래스
 */
public class ItemListenerDesignEvent implements ItemListener, ActionListener {
	
	private UseItemListenerDesign uild;
	/**
	 * ItemListenerDesignEvent 클래스에서
	 * UseItemListenerDesign 클래스의 컴포넌트를 참조하여 사용하기 위해 has a 관계 설정
	 * @param uild
	 */
	public ItemListenerDesignEvent(UseItemListenerDesign uild) {
		this.uild=uild;
	} //ItemListenerDesignEvent

	/**
	 * JTextField 에서 이벤트가 발생되었을 때 자동으로 호출되는 method
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

	} //actionPerformed

	int cnt=0;
	/**
	 * JComboBox 에서 이벤트가 발생되었을 때 자동으로 호출되는 method
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		cnt++;
//		선택된 아이템을 받아와서(MVC Pattern 도입된 Component)
//		사용자가 선택한 Item 의 번호를 받아와서 (Viewer 사용)
		if(cnt%2==0) {
			int selectedIndex=uild.getJcbDomain().getSelectedIndex();
//			Item 번호에 해당하는 Item 값을 얻기(Model 사용)
			String domain=uild.getDcbm().getElementAt(selectedIndex);
			System.out.println(domain);	
		} //end if
	} //itemStateChanged

} //class
