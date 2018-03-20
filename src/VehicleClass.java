/*
 * Created by: Phoebe Vermithrax
 * Created on: 08-March-2018
 * Created for: ICS4U
 * Daily Assignment – Day #19
 * This program creates two vehicles using the vehicle class, and outputs the speed, number of doors, and colour to the user with the 
 * listbox.
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class VehicleClass {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VehicleClass window = new VehicleClass();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Vehicle Class");
		
		List lstVehicles = new List(shell, SWT.BORDER);
		lstVehicles.setBounds(10, 10, 414, 186);
		
		Button btnCreateClasses = new Button(shell, SWT.NONE);
		btnCreateClasses.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Create two instances of the vehicle class.
				Vehicle vehicle1 = new Vehicle();
				Vehicle vehicle2 = new Vehicle();
				BicycleClass bike1 = new BicycleClass();
				Truck truck1 = new Truck();
				
				//Clear the listbox.
				lstVehicles.removeAll();
				
				//Call the functions on the vehicle.
	            vehicle1.Accelerate(50);
	            vehicle1.Brakes(30);
	            lstVehicles.add("Vehicle #1: " + vehicle1.CurrentState());
	            
	            vehicle2.Accelerate(90);
	            vehicle2.Brakes(40);
	            lstVehicles.add("Vehicle #2: " + vehicle2.CurrentState());
	            
	            lstVehicles.add("Bike #1: " + bike1.CurrentState());
	            
	            lstVehicles.add("Truck #1: " + truck1.CurrentState());
			}
		});
		btnCreateClasses.setBounds(159, 202, 122, 25);
		btnCreateClasses.setText("Create Classes");

	}
}
