//
//  ViewController.swift
//  EVA1_13_OUTLETS_ACTIONS
//
//  Created by administrador on 14/09/18.
//  Copyright © 2018 itch2. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    //LABEL
    @IBOutlet weak var lblMensaje: UILabel!
    //METODO
    @IBAction func onClick(_ sender: Any) {
        lblMensaje.text = "Mi Mensaje"
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

