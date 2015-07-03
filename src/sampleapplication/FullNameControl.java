/*
 * Copyright 2014 Benjamin Gale.
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
 */

package sampleapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FullNameControl extends UserControl implements Initializable{

    @FXML
    private TableView<String> tableData;
    @FXML
    private TableColumn colAction;
    @FXML
    private TableColumn<String, String> colCustomerId;
    @FXML
    private TableColumn<String, String> colDiscountCode;
    @FXML
    private TableColumn<String, String> colZip;
    @FXML
    private TableColumn<String, String> colName;
    @FXML
    private TableColumn<String, String> colAdderss1;
    @FXML
    private TableColumn<String, String> colAddress2;
    @FXML
    private TableColumn<String, String> colCity;
    @FXML
    private TableColumn<String, String> colState;
    @FXML
    private TableColumn<String, String> colPhone;
    @FXML
    private TableColumn<String, String> colFax;
    @FXML
    private TableColumn<String, String> colEmail;
    @FXML
    private TableColumn<String, String> colCreditLimit;
    @FXML
    private Button btnNew;
    @FXML
    private AnchorPane paneTabel;
    @FXML
    private AnchorPane paneCrud;
    @FXML
    private TextField txtId;
    @FXML
    private ComboBox cbDiscount,cbZip;
    @FXML
    private TextField txtName;
    @FXML
    private TextArea txtAddress1;
    @FXML
    private TextArea txtAddress2;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtState;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtFax;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCredit;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnBack;
    Integer status;
    @FXML
    private ImageView imgLoad;
    @FXML
    private ProgressBar bar;
    private ObservableList<String> listData;
    
    public FullNameControl() {
        System.out.println("constructor");
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize");
    }
    
}